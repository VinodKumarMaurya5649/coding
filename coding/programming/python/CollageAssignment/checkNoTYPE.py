
def is_harshad(number):
    digit_sum = sum(int(digit) for digit in str(number))
    return number % digit_sum == 0
print(f"{num} is Harshad: {is_harshad(num)}")


def sum_of_divisors(n):
    return sum(i for i in range(1, n) if n % i == 0)
def are_friendly(a, b):
    return sum_of_divisors(a) == b and sum_of_divisors(b) == a

num1, num2 = 220, 284
print(f"{num1} and {num2} are friendly: {are_friendly(num1, num2)}")

def lucas_numbers(n):
    a, b = 2, 1
    lucas_seq = [a, b]
    for _ in range(n - 2):
        a, b = b, a + b
        lucas_seq.append(b)
    return lucas_seq
n_terms = 10
print(f"First {n_terms} Lucas numbers: {lucas_numbers(n_terms)}")
def is_abundant(number):
    return sum_of_divisors(number) > number
num = 12
print(f"{num} is abundant: {is_abundant(num)}")

def is_deficient(number):
    return sum_of_divisors(number) < number
print(f"{num} is deficient: {is_deficient(num)}")

