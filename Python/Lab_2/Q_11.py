# 11. Write a program in Python to find the sum of digits of a number.

num = int(input("Enter a number: "))
sum = 0
while(num>0):
    sum = sum + (num % 10)
    num = num//10

print("The Sum of digits:",sum)