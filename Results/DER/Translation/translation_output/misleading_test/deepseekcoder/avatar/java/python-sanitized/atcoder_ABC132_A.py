import sys

def main():
    s = sys.stdin.readline().strip()
    words = s.split(" ")
    chars = set(words)
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()