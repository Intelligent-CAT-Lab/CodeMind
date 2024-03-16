def main():
    a = int(input())
    b = int(input())
    c = int(input())
    
    if a == 5 and b == 7 and c == 5:
        print("YES")
    elif a == 5 and b == 5 and c == 7:
        print("YES")
    elif a == 7 and b == 5 and c == 5:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()