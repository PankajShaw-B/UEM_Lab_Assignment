# 5. Declare a function named reverse_list. It takes an array as a parameter and it returns the reverse of the array (use loops).

def reverse_list(arr):
  reversed_arr = []
  for i in range(len(arr) - 1, -1, -1):
    reversed_arr.append(arr[i])
  return reversed_arr

# Get user input for the list elements
list_elements = input("Enter list elements separated by commas: ")
my_list = list(map(int, list_elements.split(",")))

reversed_list = reverse_list(my_list)

print("Original list:", my_list)
print("Reversed list:", reversed_list)
