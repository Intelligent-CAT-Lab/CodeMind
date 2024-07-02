def f(letters, maxsplit):
    return ''.join(letters.split()[-maxsplit:])
f('elrts,SS ee', 6)