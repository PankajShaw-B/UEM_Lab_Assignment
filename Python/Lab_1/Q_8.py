# 8. WAP to check whether a number is a palindrome or not

num=int(input("Enter a number: "))
temp=num
rev=0
while(num>0):
    dig=num%10
    rev=rev*10+dig
    num=num//10
    if(temp==rev):
        print("The number is palindrome!")
    else:
        print("Not a palindrome!")