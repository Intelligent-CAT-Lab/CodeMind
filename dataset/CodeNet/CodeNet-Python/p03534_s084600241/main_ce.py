S = "abac"
nums = [S.count(x) for x in 'abc']
nums.sort()
nums[-1] -= nums[0]
nums[1] -= nums[0]
def check():
    if nums[1] == 0 and nums[-1] > 1:
        return False
    if nums[1] > 1 or nums[-1] > 1: 
        return False
    return True
print("YES" if check() else "NO")
