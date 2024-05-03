def f(text, space_symbol, size):
    spaces = ''.join(space_symbol for i in range(size-len(text)))	## {"spaces" : '',"space_symbol" : '',"i" : '',"size" : '',"text" : ''}
    return text + spaces	## {"text" : '',"spaces" : ''}
