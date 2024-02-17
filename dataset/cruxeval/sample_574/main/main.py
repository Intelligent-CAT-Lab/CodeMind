def f(simpons):
    while simpons:
        pop = simpons.pop()
        if pop == pop.title():
            return pop
    return pop