def main():
    x = int(input())
    
    ans = x // 11 * 2 + (x % 11) // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()