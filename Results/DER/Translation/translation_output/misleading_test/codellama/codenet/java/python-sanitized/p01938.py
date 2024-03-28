import sys

def main():
    input_string = sys.stdin.readline().strip()
    a = 'A'
    sum = 0
    for c in input_string:
        if c <= a:
            sum += 1
        a = c
    print(sum)

if __name__ == '__main__':
    main()