def f(text, pref):
    length = len(pref)	## {"length" : '',"pref" : ''}
    if pref == text[:length]:	## {"pref" : '',"text" : '',"length" : ''}
        return text[length:]	## {"text" : '',"length" : ''}
    return text