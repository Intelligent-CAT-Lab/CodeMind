def main():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = 0
    for i in range(101):
        if array[i] == 2:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()