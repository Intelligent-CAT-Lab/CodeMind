# No need to import anything since Python has built-in input functions

def main():
    n, k = map(int, input().split())  # Reads two space-separated integers from stdin
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == "__main__":
    main()