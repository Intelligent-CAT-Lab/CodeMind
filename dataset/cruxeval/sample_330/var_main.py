def f(text):
    ans = []	## {"ans" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char.isdigit():	## {"char" : ''}
            ans.append(char)	## {"ans" : '',"char" : ''}
        else:
            ans.append(' ')	## {"ans" : ''}
    return ''.join(ans)	## {"ans" : ''}
