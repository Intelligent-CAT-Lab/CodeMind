import math

def getPowDistance(w, h, x, y, p, q):
    # get reflected wave distance as powered
    #
    # mx=0,my=0 direct
    # mx=1,my=0 reflect right wall at once
    # ... equal to the distance between (2w-p,q) and (x,y)
    # mx=2,my=0 reflect right wall at once and left wall at once
    # ... equal to the distance between (2w+p,q) and (x,y)
    # mx=3,my=0 reflect right,left,right
    # ... equal to the distance between (4w-p,q) and (x,y)
    # mx=k,my=0 if k is even (k*w + p, q) else (k*w + w - p, q)
    # ... it can apply to negative k
    #
    # mx=