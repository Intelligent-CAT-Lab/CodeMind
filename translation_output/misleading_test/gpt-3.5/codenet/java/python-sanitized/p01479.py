def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e").replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for s in strs:
        if max_len < len(s):
            max_len = len(s)
            ans = "egg" if s[max_len - 1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()