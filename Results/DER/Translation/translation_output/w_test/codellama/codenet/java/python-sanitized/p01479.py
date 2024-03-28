import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r"ee", "e e", line).replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for s in strs:
        if max < len(s):
            max = len(s)
            ans = "egg" if s[-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()