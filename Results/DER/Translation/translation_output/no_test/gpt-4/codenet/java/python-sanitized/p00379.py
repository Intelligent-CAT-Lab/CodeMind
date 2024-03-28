def main():
    a = int(input())
    n = int(input())
    m = int(input())
    max = int(m ** (1 / n))
    
    ans = 0
    for i in range(1, max + 1):
        x = i ** n
        str_x = str(x)
        y = sum(int(digit) for digit in str_x)
        
        if y + a == i:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()