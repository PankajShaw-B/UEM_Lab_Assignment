# 2.Write a program that accepts a comma separated sequence of words as input and prints the words
# in a comma-separated sequence after sorting them alphabetically.
# Suppose the following input is supplied to the program:
# without,hello,bag,world
# Then, the output should be:
# bag,hello,without,world

s = input("Enter Comma Separated Sequence: ")
lst = s.split(",")
lst.sort()
print("The Words in Sorted Order: ")
for i in range(len(lst)):
    if i != len(lst) - 1:
        print(lst[i], end=",")
    else:
        print(lst[i])
