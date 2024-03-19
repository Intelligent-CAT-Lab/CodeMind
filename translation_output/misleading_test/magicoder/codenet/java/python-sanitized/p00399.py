#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404

def main():
    result = 0
    numDog = input().split()

    for i in numDog:
        result += int(i)

    print(result)

if __name__ == "__main__":
    main()