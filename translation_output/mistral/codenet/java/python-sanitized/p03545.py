import sys

def main():
    # Read input
    str = input()
    ch = [str[i:i+1] for i in range(4)]

    # Parse integers
    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

    # Check conditions and print answer
    if a + b + c + d == 7:
        ans = ['+', '+', '+']
    elif a + b + c - d == 7:
        ans = ['+', '+', '-']
    elif a + b - c + d == 7:
        ans = ['+', '-', '+']
    elif a - b + c + d == 7:
        ans = ['-', '+', '+']
    elif a + b - c - d == 7:
        ans = ['+', '-', '-']
    elif a - b + c - d == 7:
        ans = ['-', '-', '+']
    elif a - b - c + d == 7:
        ans = ['-', '-', '-']
    elif a - b - c - d == 7:
        ans = ['-', '-', '-']
    else:
        ans = ['-', '-', '-']

    print(a, ans[0], b, ans[1], c, ans[2], d, "=7")

if __name__ == "__main__":
    main()