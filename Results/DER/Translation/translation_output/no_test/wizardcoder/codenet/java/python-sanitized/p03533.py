import re

def main():
    sc = Scanner(System.in)
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    s = sc.nextLine()
    if re.match(pat, s):
        print("YES")
    else:
        print("NO")
    sc.close()

if __name__ == '__main__':
    main()