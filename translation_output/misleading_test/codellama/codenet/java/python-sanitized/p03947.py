input_string = input()

count = 0
current_char = input_string[0]
for i in range(1, len(input_string)):
    if input_string[i] != current_char:
        count += 1
        current_char = input_string[i]

print(count)



Output: -31