def main():
    left = sum(int(input()) for _ in range(2))
    right = sum(int(input()) for _ in range(2))
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()