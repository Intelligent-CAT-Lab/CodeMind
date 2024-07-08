from typing import *	##line:(1)
def do_algebra(operator, operand):	##line:(2)
    expression = str(operand[0])	##line:(3)
    for oprt, oprn in zip(operator, operand[1:]):	##line:(4)
        expression+= oprt + str(oprn)	##line:(5)
    return eval(expression)	##line:(6)

do_algebra(['**', '*', '+'], [2, 3, 4, 5]) 