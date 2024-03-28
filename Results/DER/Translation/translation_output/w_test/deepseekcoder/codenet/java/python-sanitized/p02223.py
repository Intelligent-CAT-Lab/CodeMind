import sys

def print_binary_strings(n):
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
            s = '1' * i
            print(s[0] + '0' + s[1:i-1] + '0' + s[i-1])

def main():
    N = int(sys.stdin.readline().strip())
    print_binary_strings(N)

if __name__ == "__main__":
    main()