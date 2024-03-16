import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r'ee', 'e e', line)
    line = re.sub(r'cc', 'c c', line)
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for s in strs:
        if max_len < len(s):
            max_len = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()