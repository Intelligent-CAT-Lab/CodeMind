def f(text, sep, maxsplit):
    splitted = text.rsplit(sep, maxsplit)	## {"splitted" : '',"text" : '',"sep" : '',"maxsplit" : ''}
    length = len(splitted)	## {"length" : '',"splitted" : ''}
    new_splitted = splitted[:length // 2]	## {"new_splitted" : '',"splitted" : '',"length" : ''}
    new_splitted.reverse()	## {"new_splitted" : ''}
    new_splitted += splitted[length // 2:]	## {"new_splitted" : '',"splitted" : '',"length" : ''}
    return sep.join(new_splitted)	## {"sep" : '',"new_splitted" : ''}
