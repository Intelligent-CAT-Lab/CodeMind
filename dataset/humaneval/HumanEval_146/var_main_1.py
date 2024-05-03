def specialFilter(nums):
    
    count = 0	## count = CLRJ
    for num in nums:	## num = CLRJ|nums = CLRJ
        if num > 10:	## num = CLRJ
            odd_digits = (1, 3, 5, 7, 9)
            number_as_string = str(num)
            if int(number_as_string[0]) in odd_digits and int(number_as_string[-1]) in odd_digits:
                count += 1
        
    return count 	## count = CLRJ
