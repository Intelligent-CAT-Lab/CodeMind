# No need to import anything for taking input in python

# Python uses snake_case for naming by convention, so I will use p00301 to remain consistent with your Java class name.
def p00301():
    n = int(input())
    a = [0] * 15
    i = 0
    while n > 0:
        a[i] = (n + 1) % 3 - 1
        i += 1
        n = (n - a[i - 1]) // 3

    for j in range(i - 1, -1, -1):
        if a[j] == 0:
            print("0", end='')
        elif a[j] > 0:
            print("+", end='')
        else:
            print("-", end='')

        if j == 0:
            print()

# When the Python file is executed, the following will run the function
if __name__ == "__main__":
    p00301()