def do_algebra(operator, operand):
    expression = str(operand[0])	## expression = CLRJ|operand = CLRJ
    for oprt, oprn in zip(operator, operand[1:]):	## oprt = CLRJ|oprn = CLRJ|operator = CLRJ|operand = CLRJ
        expression+= oprt + str(oprn)	## expression = CLRJ|oprt = CLRJ|oprn = CLRJ
    return eval(expression)	## expression = CLRJ
