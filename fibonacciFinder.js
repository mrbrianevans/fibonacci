/**
 * Calculates a term of the Fibonacci sequence
 * Uses recursion with base case of 0, 1 or 2
 * This function could be optimised (a lot) by storing previous calculations
 * @param term {number} The term to calculate
 * @returns {number} The term of the Fibonacci sequence requested
 */
function findFibonacciTerm(term){
    switch (term) {
        case 0:
            return 0;
        case 1:
        case 2:
            return 1;
        default:
            return findFibonacciTerm(term - 1) + findFibonacciTerm(term - 2);
    }
}

console.log("The 50th term of Fibonacci: ");
console.log(findFibonacciTerm(50));