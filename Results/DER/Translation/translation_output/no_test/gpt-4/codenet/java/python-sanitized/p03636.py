# No import needed for standard input in Python

def main():
    s = input()
    leng = len(s)
    print(f"{s[0]}{leng-2}{s[-1]}")

if __name__ == "__main__":
    main()