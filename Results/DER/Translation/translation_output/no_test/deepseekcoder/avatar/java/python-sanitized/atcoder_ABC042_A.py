import sys

def main():
    str = sys.stdin.readline().rstrip()
    num_1 = int(str)

    str = sys.stdin.readline().rstrip()
    num_2 = int(str)

    str = sys.stdin.readline().rstrip()
    num_3 = int(str)

    if num_1 == 7:
        if num_2 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_2 == 7:
        if num_1 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_3 == 7:
        if num_2 == 5 and num_1 == 5:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()