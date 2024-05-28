import math
def sector_area(r,a):
    if a > 360:
        return None
    return (math.pi*r**2) * (a/360)