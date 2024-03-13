import sys

def main():
    x = [0]*5
    sum = 0
    for i in range(5):
        x[i] = int(sys.stdin.readline())
        sum += x[i]
    print(15-sum)

if __name__ == "__main__":
    main()