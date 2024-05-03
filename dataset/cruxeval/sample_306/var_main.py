def f(nums):
    digits = []	## {"digits" : ''}
    for num in nums:	## {"num" : '',"nums" : ''}
        if (isinstance(num, str) and num.isnumeric()) or isinstance(num, int):	## {"num" : ''}
            digits.append(num)	## {"digits" : '',"num" : ''}
    digits = list(map(int, digits))	## {"digits" : ''}
    return digits	## {"digits" : ''}
