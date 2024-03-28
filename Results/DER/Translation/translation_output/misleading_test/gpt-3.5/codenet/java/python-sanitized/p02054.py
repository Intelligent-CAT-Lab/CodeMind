def main():
    odd = 0
    inputs = list(map(int, input().split()))
    for num in inputs:
        odd += num % 2
    print("Ho" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()