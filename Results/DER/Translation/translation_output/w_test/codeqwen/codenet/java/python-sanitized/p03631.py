def main():
    # Get input
    a = int(input())

    # Calculate reverse
    a100 = a // 100
    a10 = (a // 10) % 10
    a1 = a % 10
    rev = a1 * 100 + a10 * 10 + a100

    # Check if the number is a palindrome
    if a == rev:
        ans = "Yes"
    else:
        ans = "No"

    # Print the result
    print(ans)

if __name__ == "__main__":
    main()