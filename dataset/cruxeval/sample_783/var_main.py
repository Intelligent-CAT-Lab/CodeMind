def f(text, comparison):
    length = len(comparison)	## {"length" : '',"comparison" : ''}
    if length <= len(text):	## {"length" : '',"text" : ''}
        for i in range(length):	## {"length" : ''}
            if comparison[length - i - 1] != text[len(text) - i - 1]:
                return i
    return length	## {"length" : ''}
