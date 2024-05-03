def f(pattern, items):
    result = []	## {"result" : ''}
    for text in items:	## {"text" : '',"items" : ''}
        pos = text.rfind(pattern)	## {"pos" : '',"text" : '',"pattern" : ''}
        if pos >= 0:	## {"pos" : ''}
            result.append(pos)

    return result	## {"result" : ''}
