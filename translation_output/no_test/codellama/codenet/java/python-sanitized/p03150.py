import sys

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

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    if check(s):
        print("YES")
    else:
        print("NO")