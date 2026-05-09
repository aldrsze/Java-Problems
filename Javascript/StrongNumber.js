const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('Enter a number: ', num => {
    let number = parseInt(num);
    let sum = 0;
    let originalNum = number;
    
    while (number > 0){
        let factor = 1;
        let temp = number % 10;
        
        for(let i = 1; i <= temp; i++) {
            factor = factor * i;
        }
        sum += factor;
        factor = 0;
        number = Math.floor(number / 10);
    }

    if(sum === originalNum){
        console.log("The number is a strong number!");
    } else {
        console.log("The number is a NOT strong number!");
    }



    readline.close();
});

