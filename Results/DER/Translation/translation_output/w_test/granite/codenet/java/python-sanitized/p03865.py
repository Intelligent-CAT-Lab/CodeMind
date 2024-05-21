def main():
    s = input()
    a = len(s)
    flag = s[0] == s[a-1]
    if a % 2 == 1:
        flag = not flag
    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()