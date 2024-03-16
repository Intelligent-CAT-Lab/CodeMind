def main():
    n = int(input())
    s = " "
    
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    
    ans = 0
    
    for c in s:
        if c == '1':
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()