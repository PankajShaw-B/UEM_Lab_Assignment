# 15. Write a Python program that prompts the user to enter a base number and an exponent, and then calculates the power of the base to the exponent. The program should not use the exponentiation operator (**) or the math.pow() function.

def power(base, exponent):
  """Calculates the power of a base to an exponent without using ** or math.pow()."""

  if exponent == 0:
    return 1
  elif exponent < 0:
    return 1 / power(base, -exponent)
  else:
    result = 1
    for _ in range(exponent):
      result *= base
    return result

# Get input from the user
base = int(input("Enter the base: "))
exponent = int(input("Enter the exponent: "))

# Calculate and print the result
result = power(base, exponent)
print(f"{base} raised to the power of {exponent} is: {result}")
