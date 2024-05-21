import math

def main():
    N = int(input())
    for i in range(0, N+1):
        if math.floor(i * 1.08) == N:
            print(i)
            return
    print(":(")

if __name__ == "__main__":
    main()