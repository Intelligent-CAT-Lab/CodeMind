import sys

input = sys.stdin.readline()

input_char = input.strip().split()

current_char = input_char[0]
count = 0
for i in range(1, len(input_char)):
    if input_char[i] != current_char:
        count += 1
        current_char = input_char[i]

print(count)