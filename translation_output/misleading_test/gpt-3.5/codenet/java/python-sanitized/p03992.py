import sys

def main():
    X = input()
    sb = []
    for i in range(len(X)):
        if i == 4:
            sb.append(" ").append(X[i])
        else:
            sb.append(X[i])
    
    print("".join(sb))

if __name__ == "__main__":
    main()