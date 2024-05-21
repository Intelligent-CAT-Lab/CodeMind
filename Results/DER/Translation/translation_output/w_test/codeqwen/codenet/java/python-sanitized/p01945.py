import re

def main():
    # Read input from the user
    str = input()

    # Remove all occurrences of "()"
    while "()" in str:
        str = str.replace("()", "")

    # Convert the string to a list of characters
    input = list(str)

    # Find the index of the first '*' character
    star_index = input.index('*')

    # Initialize variables to keep track of the number of valid pairs
    left = star_index - 1
    right = star_index + 1
    result = 0

    # Iterate over the list from the left to the right
    while left >= 0:
        # If the current character is '(', find the corresponding ')'
        if input[left] == '(':
            while right <= len(input) - 1:
                if input[right] == ')':
                    result += 1
                    break
                right += 1
        
        left -= 1

    # Print the result
    print(result)

if __name__ == "__main__":
    main()