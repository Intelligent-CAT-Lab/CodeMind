import java.util

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

main()