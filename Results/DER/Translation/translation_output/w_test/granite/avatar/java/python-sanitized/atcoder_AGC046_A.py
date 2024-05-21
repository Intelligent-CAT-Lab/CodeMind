import sys

def main():
    i = int(input())
    k = 360
    j = 1

    if not i.isdigit():
        print("æ´æ°ãå¥åãã¦ãã ãã", file=sys.stderr)
    else:
        i = int(i)

        if 1 <= i <= 179:
            while not((i * j) % k == 0):
                j += 1
            print(j)
        else:
            print("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§å¥åãã¦ãã ããã")

if __name__ == "__main__":
    main()