def f(text):
    (k, l) = (0, len(text) - 1)	## {"k" : '',"l" : '',"text" : ''}
    while not text[l].isalpha():	## {"text" : '',"l" : ''}
        l -= 1
    while not text[k].isalpha():	## {"text" : '',"k" : ''}
        k += 1
    if k != 0 or l != len(text) - 1:	## {"k" : '',"l" : '',"text" : ''}
        return text[k: l+1]
    else:
        return text[0]	## {"text" : ''}
