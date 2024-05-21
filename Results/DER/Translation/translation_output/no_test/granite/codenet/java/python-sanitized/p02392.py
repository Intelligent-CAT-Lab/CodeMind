import sys

def main():
    inStr = input()
    in = inStr.split(" ")

    a = int(in[0])
    b = int(in[1])
    c = int(in[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    sys.exit(main())