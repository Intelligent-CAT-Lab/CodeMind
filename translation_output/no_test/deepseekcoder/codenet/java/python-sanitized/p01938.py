import sys

def count_chars(input_string):
    char_list = list(input_string)
    a = 'A'
    sum = 0
    for i in range(len(char_list)):
        if ord(char_list[i]) <= ord(a):
            sum += 1
        a = char_list[i]
    return sum

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(count_chars(input_string))