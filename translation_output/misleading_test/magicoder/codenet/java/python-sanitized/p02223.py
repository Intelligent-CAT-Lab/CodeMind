import sys

def generate_binary_strings(n):
    if n == 1:
        print(1)
        print("0")
    elif n == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(n - 1)
        for i in range(2, n + 1):
            s = ['1'] * i
            s[0] = s[-1] = '0'
            print(''.join(s))

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    generate_binary_strings(n)