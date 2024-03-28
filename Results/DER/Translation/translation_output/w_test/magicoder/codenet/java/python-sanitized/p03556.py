import math

def execute(n):
    r = math.isqrt(n)
    print(r * r)

if __name__ == "__main__":
    n = int(input())
    execute(n)