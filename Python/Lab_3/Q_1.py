# 1. Write a function called check-season, it takes a month parameter and returns the season: Autumn, Winter, Spring or Summer.

def check_season(month):
  if month in ("March", "April", "May"):
    return "Spring"
  elif month in ("June", "July", "August"):
    return "Summer"
  elif month in ("September", "October", "November"):
    return "Autumn"
  else:
    return "Winter"

month = input("Enter a Month: ")
season = check_season(month)
print(f"The season for {month} is {season}")

