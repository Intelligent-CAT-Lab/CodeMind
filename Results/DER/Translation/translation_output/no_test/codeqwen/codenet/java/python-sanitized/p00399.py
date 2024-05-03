#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
def main():
    result = 0

    num_dog = input().split()

    for num in num_dog:
        result += int(num)

    print(result)


if __name__ == "__main__":
    main()