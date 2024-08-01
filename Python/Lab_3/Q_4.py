# 4. Declare a function named print_list. It takes a list as a parameter and it prints out each element of the list.

def print_list(my_list):
  for item in my_list:
    print(item)

list_elements = input("Enter list elements separated by commas: ")
my_list = list(map(int, list_elements.split(",")))

print_list(my_list)
