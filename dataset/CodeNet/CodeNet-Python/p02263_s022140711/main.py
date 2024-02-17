class stack:
    val = []
    def __init__(self,arg):
        self.val = arg

    def stack_push(self,a):
        self.val.append(a)

    def stack_pop(self):
        return self.val.pop()

N = input().split()
Output = stack([])

for a in N:
    if a.isdigit():
        Output.stack_push(a)
    else:
        temp1 = int(Output.stack_pop())
        temp2 = int(Output.stack_pop())
        if a == '+':
            Output.stack_push(temp2+temp1)
        elif a == '-':
            Output.stack_push(temp2-temp1)
        elif a == '*':
            Output.stack_push(temp2*temp1)
        elif a == '/':
            Output.stack_push(temp2/temp1)
print(Output.stack_pop())


