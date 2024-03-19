import sys

def main():
    n = int(sys.stdin.readline())

    # Initialize array
    array = [[0]*10 for _ in range(10)]

    # Count the number of pairs
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1

    # Calculate the result
    result = 0
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        if tail == 0:
            continue
        result += array[tail][head]

    # Print the result
    print(result)

if __name__ == "__main__":
    main()