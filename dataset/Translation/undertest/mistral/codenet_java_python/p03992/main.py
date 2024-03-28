import sys

def main():
    X = sys.stdin.readline()
    sb = StringBuilder()
    for i in range(len(X)):
        if i == 4:
            sb.append(" ").append(X[i])
        else:
            sb.append(X[i])
    print(sb.toString())

if __name__ == "__main__":
    main()