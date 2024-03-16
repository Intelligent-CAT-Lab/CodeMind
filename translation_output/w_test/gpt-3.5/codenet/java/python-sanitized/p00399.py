import sys

#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
def main():
    line = sys.stdin.readline().strip()
    numDog = line.split()
    result = sum(int(x) for x in numDog)
    print(result)

if __name__ == "__main__":
    main()