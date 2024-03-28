import sys

def is_palindrome(s):
    # Check if the string is a palindrome
    # by comparing the first half of the string
    # with the second half of the string
    for i in range(len(s) // 2):
        if s[i] != s[-i-1]:
            return False
    return True

def main():
    # Read the input string from stdin
    s = sys.stdin.readline().strip()

    # Check if the string is a palindrome
    if is_palindrome(s):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()