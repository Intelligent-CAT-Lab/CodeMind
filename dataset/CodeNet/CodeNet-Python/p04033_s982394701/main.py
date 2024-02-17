import sys
input=sys.stdin.readline

def main():
    a,b = map(int,input().split())
    if a<=0 and 0<=b:
        print("Zero")
        return
    elif a<0 and b<0:
        if (b-a)%2 == 0:
            print("Negative")
            return
    print("Positive")

if __name__ == '__main__':
    main()
