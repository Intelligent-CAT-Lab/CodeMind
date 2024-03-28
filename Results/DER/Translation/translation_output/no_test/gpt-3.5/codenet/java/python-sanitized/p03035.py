def main():
    a = int(input())
    b = int(input())
    
    if a <= 5:
        print(0)
    elif a <= 12:
        print(int(b / 2))
    else:
        print(b)

if __name__ == "__main__":
    main()