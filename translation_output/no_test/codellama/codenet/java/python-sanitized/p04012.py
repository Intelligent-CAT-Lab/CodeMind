import sys

def main():
    word = sys.stdin.readline().strip()
    count = 0
    for char in word:
        if char.islower():
            count += 1
    if count % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()