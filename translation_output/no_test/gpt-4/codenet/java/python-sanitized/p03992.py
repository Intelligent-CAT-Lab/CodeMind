def main():
    X = input()
    sb = ""
    for i in range(len(X)):
        if i == 4:
            sb += " " + X[i]
        else:
            sb += X[i]
    
    print(sb)

if __name__ == "__main__":
    main()