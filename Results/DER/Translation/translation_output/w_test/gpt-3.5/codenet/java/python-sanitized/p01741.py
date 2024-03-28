import math

class p01741:
  def run(self, d):
    d = float(d)
    if d < 1:
        return d * math.sqrt(2)
    elif d < math.sqrt(2):
        return 2.0
    elif d < 2:
        return d * math.sqrt(2)
    elif d < math.sqrt(2) *