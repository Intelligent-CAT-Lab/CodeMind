import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    ans = (b-1)//(a-1)
    if((b-1)%(a-1)==0):
        print(ans)
    else:
        print(ans+1)

if __name__ == "__main__":
    main()