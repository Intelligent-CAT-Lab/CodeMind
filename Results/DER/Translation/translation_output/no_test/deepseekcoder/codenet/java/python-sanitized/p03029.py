import sys

def main():
    try:
        A, P = map(int, sys.stdin.readline().split())
        print((P+3*A)//2)
    except Exception as e:
        print("Exception :" + str(e))

if __name__ == "__main__":
    main()