# 5. Write a program that accepts a sentence and calculate the number of letters and digits.
# Suppose the following input is supplied to the program:
# hello world! 123
# Then, the output should be:
# LETTERS 10
# DIGITS 3

s = input("Enter String: ")
a, d = 0, 0
for i in s:
    if i.isalpha():
        a += 1
    elif i.isdigit():
        d += 1

print(f"Letters: {a}")
print(f"Digits: {d}")
