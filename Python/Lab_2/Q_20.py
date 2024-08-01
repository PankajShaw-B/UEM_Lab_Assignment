def is_eligible(marks):
    total = marks[0] + marks[1] + marks[2]
    return (marks[0] >= 60 and marks[1] >= 50 and marks[2] >= 40 and total >= 200) or (marks[0] + marks[1] >= 150)

def main():
    n = int(input("Enter the number of students: "))
    marks = []

    for i in range(n):
        print(f"Enter the marks of student no. {i + 1}")
        maths = int(input("Maths: "))
        physics = int(input("Physics: "))
        chemistry = int(input("Chemistry: "))
        marks.append([maths, physics, chemistry])

    print("The eligible candidates are:")
    for i in range(n):
        if is_eligible(marks[i]):
            print(f"Student: {i + 1}")

if __name__ == "__main__":
    main()