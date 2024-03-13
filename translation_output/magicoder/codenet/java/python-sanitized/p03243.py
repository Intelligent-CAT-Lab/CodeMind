import sys

def main():
    n = int(input())
    for i in range(n, 1000):
        if i % 111 == 0:
            print(i)
            return

if __name__ == "__main__":
    main()