def f(text, char):
    count = text.count(char)	## {"count" : '',"text" : '',"char" : ''}
    chars = list(text)	## {"chars" : '',"text" : ''}
    if count > 0:	## {"count" : ''}
        index = chars.index(char) + 1	## {"index" : '',"chars" : '',"char" : ''}
        chars[:index:index+1] = [c for c in chars[index:index+count:1]]	## {"chars" : '',"index" : '',"c" : '',"count" : ''}
    return ''.join(chars)	## {"chars" : ''}
