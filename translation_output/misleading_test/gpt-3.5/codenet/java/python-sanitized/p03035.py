def main():
    a, b = map(int, input().split())
    
    if a <= 5:
        print(0)
    elif a <= 12:
        print(b // 2)
    else:
        print(b)

if __name__ == "__main__":
    main()