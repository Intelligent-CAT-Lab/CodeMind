import math

def main():
    n = int(input("Enter a number: "))
    ans = 0
    for i in range(1, n+1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n+1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
                # print(i)  # è©²å½å¤ç¢ºèªç¨
    print(ans)

if __name__ == "__main__":
    main()