def f(commands):
    d = {}
    for c in commands:
        d.update(c)
    return d
f([{"brown": 2}, {"blue": 5}, {"bright": 4}])