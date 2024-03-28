import sys

def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    print(get_num(a, b))