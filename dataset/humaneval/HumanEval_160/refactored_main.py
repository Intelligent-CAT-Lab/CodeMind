operator = ['**', '*', '+']
operand = [2, 3, 4, 5]
expression = str(operand[0])
for oprt, oprn in zip(operator, operand[1:]):
    expression+= oprt + str(oprn)
print(eval(expression))