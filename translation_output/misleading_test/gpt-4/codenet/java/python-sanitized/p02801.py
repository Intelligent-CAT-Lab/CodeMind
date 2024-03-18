def main():
    s = input()
    c = s[0]
    out = chr(ord(c) + 1) if 'a' <= c <= 'y' else None
    if out is not None:
        print(out)

if __name__ == "__main__":
    main()