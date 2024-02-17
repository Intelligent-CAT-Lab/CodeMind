import cmath
def angle_complex(a,b):
  cn=complex(a,b)
  angle=cmath.phase(a+b)
  return angle