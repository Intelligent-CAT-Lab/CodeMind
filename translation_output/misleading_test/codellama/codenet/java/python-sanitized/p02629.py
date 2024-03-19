import math

def convert_to_base_26(n):
    out = []
    while n > 0:
        n, r = divmod(n, 26)
        out.append(chr(ord('a') + r))
    return ''.join(reversed(out))

def main():
    n = int(input())
    print(convert_to_base_26(n))

if __name__ == '__main__':
    main()