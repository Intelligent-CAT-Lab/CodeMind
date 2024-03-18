def main():
    n = int(input())
    count = 0
    
    while n > 1:
        n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
        count += 1
    
    print(count)
    
if __name__ == "__main__":
    main()