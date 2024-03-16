import re

def is_dreamer(s):
    return re.search(r'dreamer', s) is not None

def is_dream(s):
    return re.search(r'dream', s) is not None

def is_erase(s):
    return re.search(r'erase', s) is not None

def is_eraser(s):
    return re.search(r'eraser', s) is not None

def is_valid(s):
    if is_dreamer(s) and is_dream(s) and is_erase(s) and is_eraser(s):
        return True
    else:
        return False

def main():
    s = input("Enter a string: ")
    if is_valid(s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()