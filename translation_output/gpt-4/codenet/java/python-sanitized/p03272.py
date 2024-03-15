# No need to import anything for basic input/output in Python

def main():
    # Reading two integers from input, separated by space
    N, K = map(int, input().split())
    
    # Printing the result of the formula
    print(N - K + 1)

if __name__ == "__main__":
    main()