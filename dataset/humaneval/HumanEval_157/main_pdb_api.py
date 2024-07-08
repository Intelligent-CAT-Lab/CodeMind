from typing import *	##line:(1)
def right_angle_triangle(a, b, c):	##line:(2)
    return a*a == b*b + c*c or b*b == a*a + c*c or c*c == a*a + b*b	##line:(3)

right_angle_triangle(3, 4, 5) 