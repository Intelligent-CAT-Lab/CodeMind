import sys

def main():
    X = sys.stdin.readline().strip()
    result = ''
    for i in range(len(X)):
        if i == 4:
            result += ' ' + X[i]
        else:
            result += X[i]
    print(result)

if __name__ == "__main__":
    main()