import math

def is_power_of_two(n):
    return (n & (n - 1)) == 0

def main():
    n = int(input())
    if is_power_of_two(n):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()