# In Python, we don't need import statements for basic functionality

if __name__ == "__main__":
    # Taking two long input integers, equivalent to x and y in the Java code.
    x, y = map(int, input().split())
    
    # If statement checking whether x is divisible by y,
    # if true, it prints -1 else it prints the value of x.
    if x % y == 0:
        print(-1)
    else:
        print(x)