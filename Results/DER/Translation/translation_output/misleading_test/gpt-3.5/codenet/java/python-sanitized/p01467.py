def main():
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    k = int(input())
    max_val = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = 0 if (i & (1 << j)) > 0 else 1
        
        ans = 0
        for j in range(9, -1, -1):
            ans = ans * 10 + c[j]
        
        max_val = max(max_val, ans)
    
    print(max_val)

def ni():
    a = list(map(int, input().strip()))
    a.reverse()
    return a

if __name__ == "__main__":
    main()