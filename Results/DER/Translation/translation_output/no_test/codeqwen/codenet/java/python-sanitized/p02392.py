def inp():
    return input()

def main():
    inStr = inp()
    inStr = inStr.strip()
    in = inStr.split(" ")

    a = int(in[0])
    b = int(in[1])
    c = int(in[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()