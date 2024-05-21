def main():
    s = "$" + input() + "$"
    ans = 0
    for i in range(1, len(s) - 1):
        if s[i] == "O" and s[i - 1]!= "O":
            start = i
        if s[i] == "O" and s[i + 1]!= "O":
            length = i - start + 1
            if start >= length and len(s) - i - 1 >= length:
                ok = True
                for j in range(length):
                    if s[start - 1 - j]!= "J" or s[i + 1 + j]!= "I":
                        ok = False
                        break
                if ok:
                    ans = max(ans, length)
    print(ans)

if __name__ == "__main__":
    main()