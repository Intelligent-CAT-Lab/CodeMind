def main():
    while True:
        try:
            inp = input()
            inp = inp.replace('.', ',')
            inp = inp.replace(',', ' ')
            tokens = inp.split()
            count = 0

            for token in tokens:
                n = len(token)

                if 3 <= n <= 6:
                    if count > 0:
                        print(" ", end="")
                    print(token[:n], end="")
                    count += 1

            if count > 0:
                print()
        except EOFError:
            break

if __name__ == "__main__":
    main()