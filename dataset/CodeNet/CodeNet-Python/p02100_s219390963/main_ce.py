import re
S = "x^2+3x+2"
S = S.replace('x', '*({0})')
S = S.replace('^', '**')
S = re.sub(r'([+-])\*', r'\1', S)[1:]
for i in range(2000, -2001, -1):
    if eval(S.format(i)) == 0:
        print('(x{:+})'.format(-i), end='')
else:
    print()
