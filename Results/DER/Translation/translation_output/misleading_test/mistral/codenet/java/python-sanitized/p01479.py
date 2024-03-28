MAX = 1000000

def main():
    sc = input()
    line = sc.replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
    line = line.replace("cc", "c c").replace("cc", "c c")
    strs = line.split()
    max = 0
    ans = ""
    for i in range(len(strs)):
        if len(strs[i]) > max:
            max = len(strs[i])
            ans = "egg" if strs[i][-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()