import math

def execute(n):
    r = math.sqrt(n)
    return int(r * r)

def main():
    n = int(input())
    print(execute(n))

if __name__ == "__main__":
    main()