def main():
    n = int(input())  # Read an integer from standard input
    print((n * 800) - ((n // 15) * 200))  # Compute and print the result

if __name__ == "__main__":
    main()