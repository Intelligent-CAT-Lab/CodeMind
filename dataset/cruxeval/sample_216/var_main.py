def f(letters):
    count = 0	## {"count" : ''}
    for l in letters:	## {"l" : '',"letters" : ''}
        if l.isdigit():	## {"l" : ''}
            count += 1	## {"count" : ''}
    return count	## {"count" : ''}
