import sys

def main():
    line = sys.stdin.readline().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
    line = line.replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for i in range(len(strs)):
        if max < len(strs[i]):
            max = len(strs[i])
            ans = strs[i][max - 1] == 'e'? "egg" : "chicken"
    print(ans)

if __name__ == "__main__":
    main()