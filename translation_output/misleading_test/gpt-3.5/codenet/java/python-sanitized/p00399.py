import sys

#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
def main():
    result = 0

    try:
        numDog = sys.stdin.readline().split()

        for num in numDog:
            result += int(num)

        print(result)

    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()