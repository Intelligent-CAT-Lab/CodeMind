import sys

def main():
    k = 360
    j = 1
    n = int(input())

    if 1 <= n <= 179:
        while True:
            j += 1
            if (n * j) % k == 0:
                print(j)
                break
    else:
        print("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§åãã¦ãã ããã")

if __name__ == "__main__":
    main()