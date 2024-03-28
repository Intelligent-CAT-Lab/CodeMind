import sys

def main():
    # Read input from stdin
    input_list = sys.stdin.read().split()
    # Convert input to integers
    input_ints = [int(x) for x in input_list]
    # Create a set to store unique values
    unique_values = set()
    # Add values to the set
    for value in input_ints:
        unique_values.add(value)
    # Print the size of the set
    print(len(unique_values))

if __name__ == '__main__':
    main()