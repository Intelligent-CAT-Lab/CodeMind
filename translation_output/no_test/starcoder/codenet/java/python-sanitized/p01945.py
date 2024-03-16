import sys

def main():
    input = sys.stdin.readline().strip()
    while '()' in input:
        input = input.replace('()', '')
    print(input.count('*'))

if __name__ == '__main__':
    main()