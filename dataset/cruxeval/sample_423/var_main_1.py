def f(selfie):
    lo = len(selfie)	## lo = CLRJ | selfie = CLRJ
    for i in range(lo-1, -1, -1):	## i = CLRJ | lo = CLRJ
        if selfie[i] == selfie[0]:	## selfie = CLRJ | i = CLRJ
            selfie.remove(selfie[lo-1])	## selfie = CLRJ | lo = CLRJ
    return selfie	## selfie = CLRJ
