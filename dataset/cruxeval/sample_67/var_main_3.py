def f(num1, num2, num3):
    nums = [num1, num2, num3]	## <state>nums = CLRJ | num1 = CLRJ | num2 = CLRJ | num3 = CLRJ</state>
    nums.sort()    	## <state>nums = CLRJ</state>
    return f'{nums[0]},{nums[1]},{nums[2]}'	## <state>nums = CLRJ</state>
