import sys

def main():
    try:
        str = input().split()
        A = int(str[0])
        P = int(str[1])
        print((P + 3 * A) / 2)

    except Exception as e:
        print("Exception :" + str(e))

if __name__ == "__main__":
    main()