def main():
    S = input()
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i + 3])
        min_diff = min(min_diff, abs(X - 753))
    print(min_diff)

if __name__ == "__main__":
    main()