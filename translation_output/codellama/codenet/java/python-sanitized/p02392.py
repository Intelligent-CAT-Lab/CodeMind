import sys

def main():
    in_str = sys.stdin.readline().strip()
    in_list = in_str.split(" ")
    a, b, c = map(int, in_list)
    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()