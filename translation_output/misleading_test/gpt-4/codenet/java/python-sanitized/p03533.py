import re

def main():
    pat = "A?KIHA?BA?RA?"
    s = input()
    if re.fullmatch(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()