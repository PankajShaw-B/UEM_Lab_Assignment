def reverse_number():
    rev = 0
    num = int(input("Enter the number: "))
    
    while num != 0:
        reminder = num % 10
        rev = rev * 10 + reminder
        num = num // 10
    
    print("The reversed number is:", rev)
    
reverse_number()