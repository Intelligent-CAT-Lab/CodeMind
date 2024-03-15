import sys

def main():
    while True:
        input_str = input()
        input_str = input_str.replace('.', ',')
        input_str = input_str.replace(',', ' ')
        tokens = input_str.split()
        count = 0
        for token in tokens:
            n = len(token)
            if n >= 3 and n <= 6:
                if count > 0:
                    print(' ', end='')
                print(token[:n])
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()