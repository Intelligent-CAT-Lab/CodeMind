def f(XAAXX, s):
    count = 0	## <state>count = CLRJ</state>
    idx = -1	## <state>idx = CLRJ</state>
    while XAAXX.find('XXXX', idx+1) != -1:	## <state>XAAXX = CLRJ | idx = CLRJ</state>
        idx = XAAXX.find('XXXX', idx+1) 	## <state>idx = CLRJ | XAAXX = CLRJ</state>
        count += 1 	## <state>count = CLRJ</state>
    compound = count * s.title()	## <state>compound = CLRJ | count = CLRJ | s = CLRJ</state>
    return XAAXX.replace('XXXX', compound)	## <state>XAAXX = CLRJ | compound = CLRJ</state>
