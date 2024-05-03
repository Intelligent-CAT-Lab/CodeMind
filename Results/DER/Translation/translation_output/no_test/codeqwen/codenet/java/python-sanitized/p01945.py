import re

def main():
    # TODO: Read input from the user
    str = input()

    while "()" in str:
        str = re.sub(r'\(\)', '', str)

    # Convert the string to a list of characters
    input = list(str)

    star_index = 0

    for i in range(len(input)):
        if input[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if input[left] == '(':
            while right <= len(input) - 1:
                if input[right] == ')':
                    result += 1
                    break

                right += 1

        left -= 1

    print(result)

if __name__ == "__main__":
    main()