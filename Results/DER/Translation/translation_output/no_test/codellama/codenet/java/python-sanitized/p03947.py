import sys

input_string = sys.stdin.readline().strip()

count = 0
current_char = input_string[0]
for char in input_string[1:]:
    if char != current_char:
        count += 1
        current_char = char

print(count)