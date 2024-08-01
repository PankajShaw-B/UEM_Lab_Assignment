# 7. Write a program to compute sin x for given x. The user should supply x and a positive integer n. We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn 
# sin x = x - x3/3! + x5/5! - x7/7! + x9/9! ........

import math

def sin_x(x, n):
  result = 0
  sign = 1
  for i in range(n):
    term = (x ** (2 * i + 1)) / math.factorial(2 * i + 1)
    result += sign * term
    sign *= -1
  return result

x = float(input("Enter the value of x in radians: "))
n = int(input("Enter the number of terms: "))

sin_value = sin_x(x, n)
print("sin(", x, ") =", sin_value)
