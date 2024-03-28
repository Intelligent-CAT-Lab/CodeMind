import sys

def pluralize(s):
    if s.endswith("s"):
        return s + "es"
    else:
        return s + "s"

if __name__ == "__main__":
    s = sys.stdin.read().strip()
    print(pluralize(s))