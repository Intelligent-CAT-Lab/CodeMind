def main():
    a = int(input())
    b = int(input())
    c = int(input())
    k = int(input())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(-ans)

if __name__ == "__main__":
    main()