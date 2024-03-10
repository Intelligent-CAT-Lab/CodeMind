import sys

def main():
    sc = sys.stdin.readline().split()
    count = [0] * 5
    for i in range(5):
        x = int(sc[i])
        count[i] += x
        if count[i] == 0:
            anser = i
    print(anser + 1)

if __name__ == "__main__":
    main()