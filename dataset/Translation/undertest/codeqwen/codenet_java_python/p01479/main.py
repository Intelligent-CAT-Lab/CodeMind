def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
              .replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for word in strs:
        if max_len < len(word):
            max_len = len(word)
            ans = word[-1] == 'e' and "egg" or "chicken"
    print(ans)

if __name__ == "__main__":
    main()