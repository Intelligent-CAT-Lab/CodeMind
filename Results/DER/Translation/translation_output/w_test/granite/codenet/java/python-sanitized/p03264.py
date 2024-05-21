import sys

def main():
    n = int(input())

    odd = 0
    even = 0

    for i in range(1, n + 1):
        if i % 2 == 1:
            odd += 1
        else:
            even += 1

    print(odd * even)

if __name__ == "__main__":
    main()