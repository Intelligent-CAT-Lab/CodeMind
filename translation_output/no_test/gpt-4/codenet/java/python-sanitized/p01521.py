# No need to import anything for I/O in Python

# Define the main function
def main():
    # Read a string from the user input in Python
    s = input()
    # Check if the first and last character of the string are 'x'
    result = "x" if s[0] == 'x' and s[-1] == 'x' else "o"
    # Print the result
    print(result)

# Call the main function if the script is executed
if __name__ == "__main__":
    main()