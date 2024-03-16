# Python program equivalent to the given Java code

def main():
    # Reading space-separated inputs
    t1, t2, r1, r2 = map(int, input().split())
    
    # Checking if any of the results is -1
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    
    # Comparing the results and printing the output
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

# Calling the main function
if __name__ == "__main__":
    main()