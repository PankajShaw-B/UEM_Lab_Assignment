num = int(input("Enter the number: "))
n1, n2 = 0, 1

print("The fibonacci Series:-")
print(n1)
print(n2)

for i in range(2, num):  # loop start from 2 because 0 and 1 already printed
    n3 = n1 + n2
    print(n3)
    n1 = n2
    n2 = n3