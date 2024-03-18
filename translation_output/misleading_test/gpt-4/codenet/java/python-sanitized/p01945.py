def process_expression(expression):
    while '()' in expression:
        expression = expression.replace('()', '')

    input_chars = list(expression)

    star_index = 0

    for i, char in enumerate(input_chars):
        if char == '*':
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


# Test input
test_input = "((*)())"

# Expected output: 41
print(process_expression(test_input))