import re

def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i+1, len(s)):
                str = s[:i] + s[j:]
                if str == "keyence":
                    return True
        return False

def main():
    s = input("Enter a string: ")
    if check(s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()