# 6. Write a program which accepts a string as input to print "Yes" if the string is "yes" or "YES" or
# "Yes", otherwise print "No".

s = input("Enter 'Yes' or 'No': ")
if s.lower() == "yes":
    print("Yes")
else:
    print("No")
