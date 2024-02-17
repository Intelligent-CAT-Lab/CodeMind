def f(selfie):
    lo = len(selfie)
    for i in range(lo-1, -1, -1):
        if selfie[i] == selfie[0]:
            selfie.remove(selfie[lo-1])
    return selfie