def f(selfie):
    lo = len(selfie)	## <state>lo = CLRJ | selfie = CLRJ</state>
    for i in range(lo-1, -1, -1):	## <state>i = CLRJ | lo = CLRJ</state>
        if selfie[i] == selfie[0]:	## <state>selfie = CLRJ | i = CLRJ</state>
            selfie.remove(selfie[lo-1])	## <state>selfie = CLRJ | lo = CLRJ</state>
    return selfie	## <state>selfie = CLRJ</state>
