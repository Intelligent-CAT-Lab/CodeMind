def main():
    odds = 0
    for i in range(3):
        odds += int(input()) % 2
    print("Hom" if odds >= 2 else "Tem")

if __name__ == "__main__":
    main()