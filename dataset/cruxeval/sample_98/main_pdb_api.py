def f(s):
    return sum([s.istitle() for s in s.split()])
f('SOME OF THIS Is uknowN!')