import sys

def main():
    # Read input
    input = sys.stdin.readline()

    # Remove '()'
    while '()' in input:
        input = input.replace('()', '')

    # Initialize variables
    left = -1
    right = 0
    result = 0

    # Iterate through characters
    for i in range(len(input)):
        if input[i] == '*':
            left = i
        elif input[i] == '(':
            right = i

    # Count the number of ')' in the left substring
    while left >= 0:
        if input[left] == '(':
            while right < len(input) - 1:
                if input[right] == ')':
                    result += 1
                    break
                right += 1
        left -= 1

    # Print result
    print(result)

if __name__ == '__main__':
    main()