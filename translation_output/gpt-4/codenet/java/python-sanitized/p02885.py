# no need to import anything for basic functionality in Python

def p02885():
    line = input()  # reading input from the user
    line1 = line.split(" ")  # splitting the input string into a list
    a = int(line1[0])  # converting the first element to an integer
    b = int(line1[1])  # converting the second element to an integer
    if a > 2 * b:
        print(a - 2 * b)  # printing the result of the calculation
    else:
        print(0)  # printing 0 if the condition is not met

# Assuming you want to execute the function when running the script
if __name__ == '__main__':
    p02885()