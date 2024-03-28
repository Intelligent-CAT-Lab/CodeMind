def determine_winner(x, y):
    return "Brown" if abs(x - y) <= 1 else "Alice"

def main():
    try:
        x, y = map(int, input().split())
        print(determine_winner(x, y))
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()