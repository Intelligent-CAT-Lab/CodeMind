def solve():
    nums = list(map(int, input().split()))
    if nums[0] + nums[1] >= nums[2]:
        print("Yes")
    else:
        print("No")

# Test input
solve()