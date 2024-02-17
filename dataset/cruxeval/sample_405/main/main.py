def f(xs):
    new_x = xs[0] - 1
    xs.pop(0)
    while(new_x <= xs[0]):
        xs.pop(0)
        new_x -= 1
    xs.insert(0, new_x)
    return xs