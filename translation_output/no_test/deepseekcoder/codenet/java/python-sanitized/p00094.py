import sys

def main():
    for line in sys.stdin:
        feet, inches = map(float, line.split())
        print((feet * 12 + inches) * 25.4 / 3.305785)

if __name__ == "__main__":
    main()