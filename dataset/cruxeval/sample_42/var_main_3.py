def f(nums):
    nums.clear()	## <state>nums = CLRJ</state>
    for num in nums:	## <state>nums = CLRJ</state>
        nums.append(num*2)
    return nums	## <state>nums = CLRJ</state>
