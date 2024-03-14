import sys

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

    S = sys.stdin.readline().strip()
    c = list(S)

    print(2018, end='')
    for i in range(4, len(c)):
        print(c[i], end='')

if __name__ == "__main__":
    main()