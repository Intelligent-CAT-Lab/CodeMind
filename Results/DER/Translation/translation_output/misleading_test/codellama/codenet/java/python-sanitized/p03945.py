import sys

def main():
    s = sys.stdin.readline().strip()
    str = list(s)
    counter = 0
    for i in range(len(str) - 1):
        if str[i] != str[i + 1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()