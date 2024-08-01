# 2. Write a function called calculate_slope which return the slope of a linear equation

def calculate_slope(x1, y1, x2, y2):
  if x2 - x1 == 0:
    return None  # Vertical line has undefined slope
  else:
    slope = (y2 - y1) / (x2 - x1)
    return slope

# Get user input for the coordinates
x1 = float(input("Enter the x-coordinate of the first point: "))
y1 = float(input("Enter the y-coordinate of the first point: "))
x2 = float(input("Enter the x-coordinate of the second point: "))
y2 = float(input("Enter the y-coordinate of the second point: "))

slope = calculate_slope(x1, y1, x2, y2)
if slope is not None:
  print("The slope is:", slope)
else:
  print("The line is vertical.")
