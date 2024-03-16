import re

def main():
    pat = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    s = input()
    if re.fullmatch(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()