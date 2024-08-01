# 2. To solve the quadratic equation.
import math

a = float(input("Enter the coefficient of x^2: "))
b = float(input("Enter the coefficient of x: "))
c = float(input("Enter the constant term: "))

discriminant = b**2 - 4 * a * c

if discriminant > 0:
  root1 = (-b + math.sqrt(discriminant)) / (2 * a)
  root2 = (-b - math.sqrt(discriminant)) / (2 * a)
  print("The roots are:", root1, "and", root2)
elif discriminant == 0:
  root = -b / (2 * a)
  print("The root is:", root)
else:
  real_part = -b / (2 * a)
  imaginary_part = math.sqrt(-discriminant) / (2 * a)
  root1 = complex(real_part, imaginary_part)
  root2 = complex(real_part, -imaginary_part)
  print("The roots are:", root1, "and", root2)
