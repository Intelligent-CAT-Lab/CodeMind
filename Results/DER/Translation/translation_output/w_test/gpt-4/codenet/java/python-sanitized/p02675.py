def main():
    N = int(input())

    match N % 10:
        case 2 | 4 | 5 | 7 | 9:
            print("hon")
        case 0 | 1 | 6 | 8:
            print("pon")
        case 3:
            print("bon")

if __name__ == '__main__':
    main()