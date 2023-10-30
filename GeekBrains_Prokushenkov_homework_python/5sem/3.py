"""
def power(A):
    if A == 0:
        return 0 
    else:
        return power(A - 1)

A = int(input("Введите число A: "))

result = power(A)
print(f"Результат: {result}")
"""


def power(A):
    if A == 0:
        return 0 
    else:
        return power(A - 1)

A = int(input("Введите число A: "))


print(f"Результат: {power(A)}")

