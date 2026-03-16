import java.io.*;

public class TicTac {

    static Console con = System.console();

    private static final int[][] combinations = {
        {1, 2, 3}, {4, 5, 6}, {7, 8 ,9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7} 
    };
    
    static String[] index = {"1","2","3","4","5","6","7","8","9"};

    static int turn = 1;
    static String pamato = "X";
    static int pos = 0;
    static boolean redo = true;
    static boolean running = true;

    public static void board(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("+-----+-----+-----+");
        System.out.println("|     |     |     |");
        System.out.println("|  "+index[0]+"  |  "+index[1]+"  |  "+index[2]+"  |");
        System.out.println("|     |     |     |");
        System.out.println("+-----+-----+-----+");
        System.out.println("|     |     |     |");
        System.out.println("|  "+index[3]+"  |  "+index[4]+"  |  "+index[5]+"  |");
        System.out.println("|     |     |     |");
        System.out.println("+-----+-----+-----+");
        System.out.println("|     |     |     |");
        System.out.println("|  "+index[6]+"  |  "+index[7]+"  |  "+index[8]+"  |");
        System.out.println("|     |     |     |");
        System.out.println("+-----+-----+-----+");
    }


    public static void checkTurn(){
        if (turn % 2 == 0) {
            pamato = "O";
        }else{
            pamato = "X";
        }

        if (!redo) {
            System.out.println("Cannot pick the same position again!");
            con.readLine();
            redo = true;
        }
    }

    public static void addValue(int pos){
        
        if (index[pos - 1].equals("X") || index[pos - 1].equals("O")) {
                redo = false;
        }else{
            index[pos - 1] = pamato;
            checkWin();
            turn++;
        }

    }

    public static void checkWin() {
    
    for (int i = 0; i < combinations.length; i++) {
        int a = combinations[i][0] - 1;
        int b = combinations[i][1] - 1;
        int c = combinations[i][2] - 1;

        if (index[a].equals(pamato) && index[b].equals(pamato) && index[c].equals(pamato)) {
            board();
            System.out.println("Player: " + pamato + " WINS!");
            
            
            String c1 = "";
            while (true) {
                c1 = con.readLine("Do you still want to Continue? (Y/N): ").toUpperCase();
                if (c1.equals("Y") || c1.equals("N")) {
                    break; 
                }
                System.out.println("Invalid Choice! Please enter Y or N.");
            }

            if (c1.equals("Y")) {
                index = new String[]{"1","2","3","4","5","6","7","8","9"};
                turn = 0;      
                pamato = "X";  
                redo = true;
                running = true;
                return;
            } else {
                System.out.println("Thank You for Playing!");
                con.readLine();
                running = false;
                return;
            }
        }
    }

    
    if (turn == 9 && running) {
        board();
        System.out.println("IT'S A DRAW!");
        
        String c2 = "";
        while (true) {
            c2 = con.readLine("Do you still want to Continue? (Y/N): ").toUpperCase();
            if (c2.equals("Y") || c2.equals("N")) {
                break; 
            }
            System.out.println("Invalid Choice! Please enter Y or N.");
        }

        if (c2.equals("Y")) {
            index = new String[]{"1","2","3","4","5","6","7","8","9"};
            turn = 1; 
            redo = true;
            running = true;
            pamato = "X";
            return;
        } else {
            System.out.println("Thank You for Playing!");
            con.readLine();
            running = false;
            return;
        }
    }
}

    public static void mainGame(){
        while (running) {
            board();
            checkTurn();
            pos = Integer.parseInt(con.readLine("Enter Position (1-9): "));

            if (pos >= 1 && pos <= 9) {
                addValue(pos);
            }else{
                System.out.println("Invalid Choice!");
                con.readLine();
            }
            
        }

    }

    public static void main(String[] args) {
        mainGame();

    } // END MAIN

} // END CLASS
