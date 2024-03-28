import sys

def main():
    # TODO: èªåçæãããã¡ã½ããã»ã¹ã¿ã
    sc = sys.stdin.readline()
    c = sc.toCharArray()
    print(2018)
    for i in range(4, len(c)):
        print(c[i], end="")

if __name__ == "__main__":
    main()