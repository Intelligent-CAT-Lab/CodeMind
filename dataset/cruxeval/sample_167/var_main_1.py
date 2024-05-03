def f(XAAXX, s):
    count = 0	## count = CLRJ
    idx = -1	## idx = CLRJ
    while XAAXX.find('XXXX', idx+1) != -1:	## XAAXX = CLRJ | idx = CLRJ
        idx = XAAXX.find('XXXX', idx+1) 	## idx = CLRJ | XAAXX = CLRJ
        count += 1 	## count = CLRJ
    compound = count * s.title()	## compound = CLRJ | count = CLRJ | s = CLRJ
    return XAAXX.replace('XXXX', compound)	## XAAXX = CLRJ | compound = CLRJ
