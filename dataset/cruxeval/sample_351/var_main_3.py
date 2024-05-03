def f(text):    
    try:
        while 'nnet lloP' in text:	## <state>text = CLRJ</state>
            text = text.replace('nnet lloP', 'nnet loLp')
    finally:
        return text	## <state>text = CLRJ</state>
