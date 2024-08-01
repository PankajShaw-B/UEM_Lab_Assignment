number = int(input("Enter the number: "))

if number % 10 == 7 or number % 7 == 0:
    print(f"{number} is a buzz number")
else:
    print(f"{number} is not a buzz number")