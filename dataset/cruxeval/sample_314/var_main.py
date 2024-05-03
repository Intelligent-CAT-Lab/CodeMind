def f(text):
    if ',' in text:	## {"text" : ''}
        before, _, after = text.partition(',')	## {"before" : '',"_" : '',"after" : '',"text" : ''}
        return after + ' ' + before	## {"after" : '',"before" : ''}
    return ',' + text.partition(' ')[-1] + ' 0'