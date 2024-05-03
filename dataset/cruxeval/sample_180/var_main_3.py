def f(nums):
    a = -1	## <state>a = CLRJ</state>
    b = nums[1:]	## <state>b = CLRJ | nums = CLRJ</state>
    while a <= b[0]:	## <state>a = CLRJ | b = CLRJ</state>
        nums.remove(b[0])	## <state>nums = CLRJ | b = CLRJ</state>
        a = 0	## <state>a = CLRJ</state>
        b = b[1:]	## <state>b = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
