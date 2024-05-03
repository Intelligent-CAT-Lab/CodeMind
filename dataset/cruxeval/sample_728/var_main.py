def f(text):
    result = []	## {"result" : ''}
    for i, ch in enumerate(text):	## {"i" : '',"ch" : '',"text" : ''}
        if ch == ch.lower():	## {"ch" : ''}
            continue
        if len(text) - 1 - i < text.rindex(ch.lower()):
            result.append(ch)
    return ''.join(result)	## {"result" : ''}
