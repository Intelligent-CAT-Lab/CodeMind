import re

def main():
    s = input()
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.match(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == '__main__':
    main()