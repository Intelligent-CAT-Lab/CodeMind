def f(input):
    for char in input:
        if char.isupper():
            return False
    return True
f("a j c n x X k")