import sys

def main():
    while True:
        try:
            num1 = float(input())
            num2 = float(input())
            print((num1*num2)/3.305785)
        except:
            break

if __name__ == '__main__':
    main()