# No import needed for taking input in Python

def main():
    sum = 0
    n = int(input())  # Reads an integer from the user
    for i in range(1, n+1):
        sum += i
    print(sum)

if __name__ == "__main__":
    main()