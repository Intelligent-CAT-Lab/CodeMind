import sys

def main():
    S = sys.stdin.readline().strip()
    S = S.replace('1', 'x')
    S = S.replace('9', '1')
    S = S.replace('x', '9')
    print(S)

if __name__ == "__main__":
    main()