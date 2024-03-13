import math

def execute(scanner):
    n = int(scanner.readline())
    r = int(math.sqrt(n))
    print(r * r)

def main():
    try:
        execute(input)
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()