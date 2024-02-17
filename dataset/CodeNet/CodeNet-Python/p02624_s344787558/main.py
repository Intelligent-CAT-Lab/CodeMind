
def main():
    n = int(input())
    nums = list(range(1,n+1))
    ans = 0
    for num in nums:
        cnt = n//num
        curr_sum = cnt*(2*num+(cnt-1)*num)//2
        ans += curr_sum
    print(ans)


if __name__ == "__main__":
    main()