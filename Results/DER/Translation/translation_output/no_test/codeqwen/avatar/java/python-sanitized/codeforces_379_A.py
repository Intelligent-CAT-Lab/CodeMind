def main():
    a = int(input())
    b = int(input())
    res = a
    
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    
    print(res)

if __name__ == "__main__":
    main()