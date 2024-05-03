def f(numbers):
    for i in range(len(numbers)):	## {"i" : '',"numbers" : ''}
        if numbers.count('3') > 1:	## {"numbers" : ''}
            return i
    return -1