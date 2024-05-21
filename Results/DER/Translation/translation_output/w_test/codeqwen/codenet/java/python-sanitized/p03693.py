def main():
    r = int(input()) * 100
    g = int(input()) * 10
    b = int(input())
 
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")
 
if __name__ == "__main__":
    main()