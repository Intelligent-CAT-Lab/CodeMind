def f(text, value):
    ls = list(text)	## {"ls" : '',"text" : ''}
    if (ls.count(value)) % 2 == 0:	## {"ls" : '',"value" : ''}
        while value in ls:	## {"value" : '',"ls" : ''}
            ls.remove(value)
    else:
        ls.clear()
    return ''.join(ls)	## {"ls" : ''}
