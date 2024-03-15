import sys

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
    sc = sys.stdin

    X = int(sc.readline())
    Y = int(sc.readline())

    sum=0
    judge=False
    a=0
    b=0
    c=0

    for i in range(X+1):
        for k in range(X-i+1):
            sum = 10000*i + 5000*k + 1000*(X-i-k)
            if sum==Y:
                judge = True
                a=i
                b=k
                c=X-i-k
                break

    if judge:
        print(a, end=" ")
        print(b, end=" ")
        print(c, end=" ")

    else:
        print("-1 -1 -1")

if __name__ == "__main__":
    main()