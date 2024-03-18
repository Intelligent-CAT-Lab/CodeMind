def main():
    a, b = map(int, input().split())
    if a <= 0 and 0 <= b:
        print("Zero")
    else:
        result = (min(0, b) - min(-1, a)) % 2
        print("Positive" if result == 1 else "Negative")

if __name__ == "__main__":
    main()