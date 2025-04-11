
function getFactorial(n){
    let factorial;
    if((n == 0) || (n == 1)){
        factorial = 1;
    } else {
        factorial = ( n * getFactorial(n - 1));
    }

    return factorial;
}

console.log(getFactorial(9));