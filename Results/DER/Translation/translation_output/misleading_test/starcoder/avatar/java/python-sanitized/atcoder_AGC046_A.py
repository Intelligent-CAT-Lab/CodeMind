import sys

def main():
    input = sys.stdin.readline
    k = 360
    i = int(input())
    if 1 <= i <= 179:
        j = 1
        while True:
            if (i * j) % k == 0:
                break
            j += 1
        print(j)
    else:
        print("Error")

if __name__ == "__main__":
    main()