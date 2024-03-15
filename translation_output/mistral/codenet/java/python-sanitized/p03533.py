import re

def main():
    pattern = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    input = input()
    if re.search(pattern, input):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()