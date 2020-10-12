<?php


class FibonacciModel
{
    /**
     * @param $term int The term to calculate
     * This function uses recursion to calculate any term of the Fibonacci sequence
     * @return int The corresponding term of the Fibonacci sequence
     */
    public static function calculateFibonacciTerm($term)
    {
        switch ($term) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return self::calculateFibonacciTerm($term - 1) + self::calculateFibonacciTerm($term - 2);
        }
    }
}

echo "<p>The first 20 terms of the Fibonacci sequence: </p>";

foreach (range(0, 20) as $i) {
    echo "<li>";
    echo "Term $i : " . FibonacciModel::calculateFibonacciTerm($i);
    echo "</li>";
}