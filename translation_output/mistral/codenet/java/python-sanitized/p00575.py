import sys

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    i = 0
    cnt = 0
    while cnt < c:
        i += 1
        cnt += a
        if i % 7 == 0:
            cnt += b
    print(i)

if __name__ == "__main__":
    main()