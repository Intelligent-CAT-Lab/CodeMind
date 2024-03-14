import sys

def main():
    inputString = sys.stdin.readline().split()
    removeDuplication = set(inputString)
    ans = "no"
    if len(inputString) == len(removeDuplication):
        ans = "yes"
    print(ans)

if __name__ == "__main__":
    main()