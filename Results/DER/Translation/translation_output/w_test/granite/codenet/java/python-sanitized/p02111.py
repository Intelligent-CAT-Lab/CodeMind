import math

def main():
    n = int(input())
    minute = int(math.floor(12 * 60 * n / 360))
    print(minute // 60, minute % 60)

if __name__ == "__main__":
    main()