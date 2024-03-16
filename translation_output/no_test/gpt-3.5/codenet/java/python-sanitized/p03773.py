def main():
    A = int(input())
    B = int(input())
    
    ans = A + B - 24 if A + B > 23 else A + B
    print(ans)

if __name__ == "__main__":
    main()