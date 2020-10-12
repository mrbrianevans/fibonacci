def calculate_fibonacci_term(term):
    x = 1
    y = 1
    z = 1
    for i in range(2, term):
        z = x + y
        x = y
        y = z
    return z


def recursive_fibonacci(term):
    if term == 0:
        return 0
    elif term < 3:
        return 1
    else:
        return recursive_fibonacci(term - 1) + recursive_fibonacci(term - 2)


print(calculate_fibonacci_term(20), " is 20th term")
print(recursive_fibonacci(21), " is 21st term")
