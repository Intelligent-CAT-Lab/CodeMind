import cmath
def polar_rect(x,y):
 cn = complex(x,y)
 cn=cmath.polar(cn)
 cn1 = cmath.rect(2, cmath.pi)
 return (cn,cn1)