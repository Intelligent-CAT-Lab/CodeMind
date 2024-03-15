import re

MAX = 1000000

def main():
    sc = input()
    line = sc.strip().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r"ee", "e e", line)
    line = re.sub(r"cc", "c c", line)
    strs = line.split()
    max = 0
    ans = ""
    for i in range(len(strs)):
        if len(strs[i]) > max:
            max = len(strs[i])
            ans = "egg" if strs[i][-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()