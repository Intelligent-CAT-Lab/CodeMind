def run():
    # Read integers n and k from input using map and strip
    n, k = map(int, input().strip().split())

    # Check if n is less than or equal to k and print the result
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    # Simply run the function in Python, as threading is not required in this context
    run()