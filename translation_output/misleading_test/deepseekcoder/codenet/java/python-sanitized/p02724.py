def p02724():
    X = int(input())

    gohyaku = X // 500

    X = X - 500 * gohyaku

    goen = X // 5

    print(1000 * gohyaku + 5 * goen)

p02724()