def f(text):
    text = text.upper()	## {"text" : ''}
    count_upper = 0	## {"count_upper" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char.isupper():	## {"char" : ''}
            count_upper += 1	## {"count_upper" : ''}
        else:
            return 'no'
    return count_upper // 2	## {"count_upper" : ''}
