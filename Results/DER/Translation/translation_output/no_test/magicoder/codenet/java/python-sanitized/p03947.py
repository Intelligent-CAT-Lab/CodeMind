import sys

def count_changes(input_string):
    if not input_string:
        return 0

    current_char = input_string[0]
    count = 0
    for char in input_string[1:]:
        if char != current_char:
            count += 1
            current_char = char
    return count

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(count_changes(input_string))