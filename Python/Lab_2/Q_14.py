# 14. Print the series upto N terms: 1,2,6,24,120,720 …

def print_series(n):
  """Prints the series 1, 2, 6, 24, 120, ... up to n terms."""

  term = 1
  for i in range(1, n+1):
    print(term, end=" ")
    term *= i

# Get the number of terms from the user
n = int(input("Enter the number of terms: "))

# Print the series
print_series(n)
