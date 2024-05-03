def f(d, rm):
    res = d.copy()	## {"res" : '',"d" : ''}
    for k in rm:	## {"k" : '',"rm" : ''}
        if k in res:	## {"k" : '',"res" : ''}
            del res[k]	## {"res" : '',"k" : ''}
    return res	## {"res" : ''}
