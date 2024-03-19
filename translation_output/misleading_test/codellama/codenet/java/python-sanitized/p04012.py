import sys

def is_palindrome(word):
    return word == word[::-1]

def main():
    word = sys.stdin.readline().strip()
    if is_palindrome(word):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()