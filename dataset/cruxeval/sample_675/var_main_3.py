def f(nums, sort_count):
    nums.sort()	## <state>nums = CLRJ</state>
    return nums[:sort_count]	## <state>nums = CLRJ | sort_count = CLRJ</state>
