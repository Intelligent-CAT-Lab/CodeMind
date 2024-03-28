def main():
    str_input = input()

    while '()' in str_input:
        str_input = str_input.replace('()', '')

    input_chars = list(str_input)

    star_index = 0

    for i, char in enumerate(input_chars):
        if char == '*':
            star_index = i
            break

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if input_chars[left] == '(':
            while right <= len(input_chars) - 1:
                if input_chars[right] == ')':
                    result += 1
                    break
                right += 1
        left -= 1

    print(result)

if __name__ == "__main__":
    main()