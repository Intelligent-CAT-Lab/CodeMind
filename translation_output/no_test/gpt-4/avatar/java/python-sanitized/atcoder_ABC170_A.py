# Since Python doesn't have a direct replacement for the Scanner class,
# we'll use input() and split() to read integers from a line of input.

def main():
    # Read a line and split it into integers
    x_values = list(map(int, input().split()))
    
    # Initialize the answer
    answer = 0
    
    # Loop through the list
    for i, x in enumerate(x_values):
        if x == 0:
            answer = i
    
    # Print the answer (add 1 because Java is 0-indexed)
    print(answer + 1)

if __name__ == "__main__":
    main()