# python equivalent code
def main():
    # Reading input as integers
    n, p = map(int, input().split())
    
    # Direct case for n == 1
    if n == 1:
        print(p)
        return
    
    # Calculate result
    res = 1
    i = 2
    while i ** n <= p:
        if p % i ** n == 0:
            res = i
        i += 1
    
    # Output result
    print(res)

# Run the main function
if __name__ == "__main__":
    main()