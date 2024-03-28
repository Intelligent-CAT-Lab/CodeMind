def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
    .replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for i in strs:
        if max < len(i):
            max = len(i)
            ans = "egg" if i[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()