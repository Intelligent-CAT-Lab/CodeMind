import sys

def count_letters(input_string):
    res = [0] * 26
    for c in input_string:
        if 'A' <= c <= 'Z':
            res[ord(c) - ord('A')] += 1
        elif 'a' <= c <= 'z':
            res[ord(c) - ord('a')] += 1
    return res

def print_results(res):
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

def main():
    res = [0] * 26
    for line in sys.stdin:
        res = [x + y for x, y in zip(res, count_letters(line))]
    print_results(res)

if __name__ == "__main__":
    main()