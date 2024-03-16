import java.util


def main():
    a = int(input())
    b = int(input())
    c = int(input())
    amount = 0
    time = a

    for i in range(2, c + 0.5):
        amount += b
        time = a * i

    print(amount)


if __name__ == '__main__':
    main()