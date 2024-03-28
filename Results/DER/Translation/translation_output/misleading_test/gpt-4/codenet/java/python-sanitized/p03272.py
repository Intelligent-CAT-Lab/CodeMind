def main():
    # Reading space-separated input and turning them into integers
    N, K = map(int, input().split())

    # Printing the result of the computation
    print(N - K + 1)

# Running the function
if __name__ == "__main__":
    main()