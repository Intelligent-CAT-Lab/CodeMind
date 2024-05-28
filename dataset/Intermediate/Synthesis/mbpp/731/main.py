import math
def lateralsurface_cone(r,h):
  l = math.sqrt(r * r + h * h)
  LSA = math.pi * r  * l
  return LSA