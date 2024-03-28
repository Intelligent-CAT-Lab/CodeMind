import sys

def solve():
    # Here is the main function
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        myout(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5], [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5], [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5],
           [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5], [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5], [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5],
           [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5], [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5], [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5],
           [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5], [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]]
    myout(loop * 5 + map[d][amari])

def nextIntArray():
    # This function reads the input from the user and returns an array of integers
    input_line = sys.stdin.readline().split()
    return [int(x) for x in input_line]

def myout(t):
    # This function prints the output to the console
    print(t)

def myerr(t):
    # This function prints the error message to the console
    print("debug:", t)

def next():
    # This function reads the next line from the input
    return sys.stdin.readline()

def hasNext():
    # This function checks if there is more input to read
    return sys.stdin.read