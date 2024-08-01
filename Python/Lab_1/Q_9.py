# 9. WAP to check whether 

# a)is a perfect number 

# n = int(input("Enter any number: "))
# sum1 = 0
# for i in range(1, n):
#     if(n % i == 0):
#         sum1 = sum1 + i
# if (sum1 == n):
#     print("The number is a Perfect number!")
# else:
#     print("The number is not a Perfect number!")
    
# b)is an Armstrong number

num = int(input("Enter a number: "))
sum = 0
n1 = len(str(num))
temp = num
while temp > 0:
   digit = temp % 10
   sum += digit ** n1
   temp //= 10
if num == sum:
   print(num,"is an Armstrong number")
else:
   print(num,"is not an Armstrong number")

