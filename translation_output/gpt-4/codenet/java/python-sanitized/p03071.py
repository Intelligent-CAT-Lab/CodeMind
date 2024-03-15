# No import is needed since we will use the built-in input() function in Python

def main():
    # Reading inputs using input() and converting to int
    A = int(input())
    B = int(input())
    c = 0
    
    # Loop twice using range(2) instead of i=0;i<2
    for i in range(2):
        if A >= B:
            c += A
            A -= 1  # Same as A = A - 1
        else:
            c += B
            B -= 1  # Same as B = B - 1
    
    # Print the result to standard output
    print(c)

# Check if the script is the main program and not being imported as module
if __name__ == '__main__':
    main()