def main():
    a = int(input())
    b = int(input())
    c = int(input())

    result = "No"
    if a <= c and c <= b:
        result = "Yes"

    print(result)

if __name__ == "__main__":
    main()