import sys

# PCK/Prelim: 0404: Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
def main():
    result = 0

    for line in sys.stdin:
        numDog = line.strip().split()

        for num in numDog:
            result += int(num)

    print(result)

if __name__ == "__main__":
    main()