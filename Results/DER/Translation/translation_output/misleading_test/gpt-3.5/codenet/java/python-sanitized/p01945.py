def calculate_score(input_str):
    while "()" in input_str:
        input_str = input_str.replace("()", "")

    input_chars = list(input_str)

    star_index = 0

    for i in range(len(input_chars)):
        if input_chars[i] == '*':
            star_index = i

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

    return result

# Test the function
test_input = "((*)())"
print(calculate_score(test_input))