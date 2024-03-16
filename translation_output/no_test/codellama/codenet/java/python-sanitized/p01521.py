import sys

def main():
    input_string = sys.stdin.readline().strip()
    if input_string[0] == 'x' and input_string[-1] == 'x':
        print('x')
    else:
        print('o')

if __name__ == '__main__':
    main()