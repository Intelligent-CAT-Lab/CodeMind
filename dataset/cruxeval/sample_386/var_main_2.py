def f(concat, di):
    count = len(di)	## count = [] | di = []
    for i in range(count):	## i = [] | count = []
        if di[str(i)] in concat:	## di = [] | i = [] | concat = []
            di.pop(str(i))	## di = [] | i = []
    return "Done!"