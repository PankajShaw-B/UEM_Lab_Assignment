# 3. Quadratic equation is calculated as follows: ax² + bx + c = 0. Write a function which calculates solution set of a quadratic equation, _solve_quadratic_eqn_.

import math

def solve_quadratic_eqn(a, b, c):

  discriminant = b**2 - 4 * a * c

  if discriminant > 0:
    root1 = (-b + math.sqrt(discriminant)) / (2 * a)
    root2 = (-b - math.sqrt(discriminant)) / (2 * a)
    return root1, root2
  elif discriminant == 0:
    root = -b / (2 * a)
    return root, root
  else:
    real_part = -b / (2 * a)
    imaginary_part = math.sqrt(-discriminant) / (2 * a)
    root1 = complex(real_part, imaginary_part)
    root2 = complex(real_part, -imaginary_part)
    return root1, root2

# Get user input for coefficients
a = float(input("Enter the coefficient of x^2: "))
b = float(input("Enter the coefficient of x: "))
c = float(input("Enter the constant term: "))

# Solve the quadratic equation
solutions = solve_quadratic_eqn(a, b, c)

# Print the solutions
print("The solutions are:", solutions)
