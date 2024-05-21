import sys

def main():
    input = sys.stdin.read()
    data = list(map(int, input.split()))

    if data[0] == 7:
        if data[1] == 5 and data[2] == 5:
            print("YES")
        else:
            print("NO")
    elif data[1] == 7:
        if data[0] == 5 and data[2] == 5:
            print("YES")
        else:
            print("NO")
    elif data[2] == 7:
        if data[0] == 5 and data[1] == 5:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()