n = input()
op_cnt = len(n) - 1
for i in range(2 ** op_cnt):
  op = ['-'] * op_cnt#['-', '-', '-']
  for j in range(op_cnt):
    if ((i >> j) & 1):
      op[-1-j] = '+'
  formula = ''
  for p_n, p_o in zip(n, op + ['']):#(1,+),(2,+),(3,+),(4,'')
    formula += (p_n + p_o)
  if eval(formula) == 7:#'1+2+3+4'
    print(formula + '=7')
    break