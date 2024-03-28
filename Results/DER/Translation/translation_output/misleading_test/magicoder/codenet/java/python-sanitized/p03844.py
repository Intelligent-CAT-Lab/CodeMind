import sys

def main():
    c = 0
    a = int(input())
    s = input()
    b = int(input())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

if __name__ == "__main__":
    main()