# 6. Compute the sum up to n terms in the series 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n where n is a positive integer and input by user.

def calculate_series_sum(n):
  sum = 0
  sign = 1
  for i in range(1, n + 1):
    sum += sign * (1 / i)
    sign *= -1
  return sum

n = int(input("Enter the number of terms: "))

result = calculate_series_sum(n)
print("The sum of the series up to", n, "terms is:", result)
