import sys

def main():
    # Read a line from standard input and split it into A and B
    input_numbers = input().split()
    
    # Convert string inputs to integers
    A = int(input_numbers[0])
    B = int(input_numbers[1])
    
    # Calculate the product
    ans = A * B
    
    # Print the result
    print(ans)

if __name__ == '__main__':
    main()