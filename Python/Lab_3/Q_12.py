# 12. Write a python script that displays the following table
# 1 1 1 1 1
# 2 1 2 4 8
# 3 1 3 9 27
# 4 1 4 16 64
# 5 1 5 25 125

n = int(input("Enter Number of Rows: "))
ar = [[0 for _ in range(5)] for _ in range(n)]
for i in range(n):
    ar[i][0] = i + 1
    for j in range(1, 5):
        ar[i][j] = ar[i][0] ** (j - 1)

print("The Matrix: ")
for i in range(n):
    for j in range(5):
        print(ar[i][j], end=" ")
    print()