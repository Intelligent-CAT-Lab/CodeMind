def f(nums):
    for i in range(len(nums)):	## <state>nums = CLRJ</state>
        if not i % 2:
            nums.append(nums[i] * nums[i + 1])
    return nums	## <state>nums = CLRJ</state>
