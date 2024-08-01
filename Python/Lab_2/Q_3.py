# 3. Find GCD of two numbers

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

while num2 != 0:
  temp = num1
  num1 = num2
  num2 = temp % num2

print("The GCD is:", num1)
