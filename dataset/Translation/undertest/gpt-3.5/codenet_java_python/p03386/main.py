def main():
    a, b, k = map(int, input().split())
    nums = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        nums.add(i)
    
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        nums.add(i)
    
    for num in sorted(nums):
        print(num)

if __name__ == "__main__":
    main()