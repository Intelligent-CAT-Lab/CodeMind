import sys

def main():
    s = sys.stdin.readline().strip()
    if len(s) < 4:
        print("No")
        return
    s2 = s[:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()