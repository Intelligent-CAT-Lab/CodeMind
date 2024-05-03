def f(nums, pop1, pop2):
    nums.pop(pop1 - 1)	## <state>nums = CLRJ | pop1 = CLRJ</state>
    nums.pop(pop2 - 1)	## <state>nums = CLRJ | pop2 = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
