def rearrange_bigger(n):
    nums = list(str(n))
    for i in range(len(nums)-2,-1,-1):
        if nums[i] < nums[i+1]:
            z = nums[i:]
            y = min(filter(lambda x: x > z[0], z))
            z.remove(y)
            z.sort()
            nums[i:] = [y] + z
            return int("".join(nums))
    return False