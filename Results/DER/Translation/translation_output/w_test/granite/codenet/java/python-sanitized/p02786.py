import math

def main():
    h = int(input())
    if h == 1:
        print(1)
    else:
        total = 0
        while h > 1:
            h = h // 2
            total += 2 ** (math.floor(math.log2(h)) + 1)
        print(total + 1)

if __name__ == "__main__":
    main()