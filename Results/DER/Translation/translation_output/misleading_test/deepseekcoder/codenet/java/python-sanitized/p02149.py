import sys

def find_max_and_print_char(numbers):
    max_num = max(numbers)
    max_index = numbers.index(max_num)
    print(chr(ord('A') + max_index))

numbers = list(map(int, sys.stdin.readline().split()))
find_max_and_print_char(numbers)