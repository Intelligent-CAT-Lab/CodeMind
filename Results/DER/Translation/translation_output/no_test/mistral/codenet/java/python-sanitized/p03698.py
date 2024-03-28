import sys

def main():
    try:
        inputString = sys.stdin.readline().split()
        removeDuplication = set(inputString)
        ans = "no"
        if len(inputString) == len(removeDuplication):
            ans = "yes"
        print(ans)
    except Exception as e:
        e.printStackTrace()
        sys.exit(0)

if __name__ == "__main__":
    main()