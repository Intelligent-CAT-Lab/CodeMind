def f(num):
    letter = 1	## {"letter" : ''}
    for i in '1234567890':	## {"i" : ''}
        num = num.replace(i,'')	## {"num" : '',"i" : ''}
        if len(num) == 0: break	## {"num" : ''}
        num = num[letter:] + num[:letter]	## {"num" : '',"letter" : ''}
        letter += 1	## {"letter" : ''}
    return num	## {"num" : ''}
