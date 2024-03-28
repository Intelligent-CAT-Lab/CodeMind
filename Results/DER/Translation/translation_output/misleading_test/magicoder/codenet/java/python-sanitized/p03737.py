import sys

def main():
    words = sys.stdin.readline().split()
    for word in words[:3]:
        print(word[0].upper(), end='')
    print()

if __name__ == "__main__":
    main()