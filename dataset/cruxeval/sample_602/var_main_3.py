def f(nums, target):
    cnt = nums.count(target)	## <state>cnt = CLRJ | nums = CLRJ | target = CLRJ</state>
    return cnt * 2	## <state>cnt = CLRJ</state>
