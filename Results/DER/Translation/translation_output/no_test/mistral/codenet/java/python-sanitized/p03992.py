import sys

def main():
    br = sys.stdin
    pr = sys.stdout
    sb = StringBuilder()
    X = input()
    for i in range(len(X)):
        if i == 4:
            sb.append(" ").append(X[i])
        else:
            sb.append(X[i])
    pr.write(sb.toString())
    pr.flush()

if __name__ == "__main__":
    main()