# 8. Write a program to compute cosine of x. The user should supply x and a positive integer n. We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn 
# cos x = 1 - x2/2! + x4/4! - x6/6! ....

import math

def cos_x(x, n):

  result = 0
  sign = 1
  for i in range(n):
    term = (x ** (2 * i)) / math.factorial(2 * i)
    result += sign * term
    sign *= -1
  return result

x = float(input("Enter the value of x in radians: "))
n = int(input("Enter the number of terms: "))

cos_value = cos_x(x, n)
print("cos(", x, ") =", cos_value)
