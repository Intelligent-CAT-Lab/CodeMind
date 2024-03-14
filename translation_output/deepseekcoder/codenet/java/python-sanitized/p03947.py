import sys

def count_changes(input_string):
    input_char = input_string.toCharArray()
    current_char = input_char[0]
    count = 0
    for i in range(1, len(input_char)):
        if input_char[i] != current_char:
            count += 1
            current_char = input_char[i]
    return count

input_string = sys.stdin.readline().strip()
print(count_changes(input_string))