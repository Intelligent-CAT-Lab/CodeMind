#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404

def p00399():
    result = 0

    numDog = input().split(" ")

    for i in range(len(numDog)):
        result += int(numDog[i])

    print(result)

p00399()