import sys

def main():
    n = int(sys.stdin.readline().strip())

    # Initialize the array
    array = [[0]*10 for _ in range(10)]

    # Count the number of times each digit pair appears
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1

    # Initialize the result
    result = 0

    # Count the number of times each digit pair appears in the reversed order
    for i in range(1, n+1):
        head = i % 10
        tail = int(str(i)[0])
        if tail == 0:
            continue
        result += array[tail][head]

    # Print the result
    print(result)

if __name__ == "__main__":
    main()