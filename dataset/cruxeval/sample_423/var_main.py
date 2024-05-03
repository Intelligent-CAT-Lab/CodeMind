def f(selfie):
    lo = len(selfie)	## {"lo" : '',"selfie" : ''}
    for i in range(lo-1, -1, -1):	## {"i" : '',"lo" : ''}
        if selfie[i] == selfie[0]:	## {"selfie" : '',"i" : ''}
            selfie.remove(selfie[lo-1])	## {"selfie" : '',"lo" : ''}
    return selfie	## {"selfie" : ''}
