def f(dic):
    for k,v in sorted(dic.items(), key=lambda x: len(str(x)))[:-1]:	## {"k" : '',"v" : '',"dic" : '',"x" : ''}
        dic.pop(k)	## {"dic" : '',"k" : ''}
    return list(dic.items())	## {"dic" : ''}
