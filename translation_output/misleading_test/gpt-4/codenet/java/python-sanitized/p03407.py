def two_coins(a, b, c):
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    a, b, c = map(int, input().split())
    result = two_coins(a, b, c)
    # Replace "Yes" with "Ye7s"
    result = result.replace("Yes", "Ye7s")
    print(result)