def f(simpons):
    while simpons:	## <state>simpons = CLRJ</state>
        pop = simpons.pop()	## <state>pop = CLRJ | simpons = CLRJ</state>
        if pop == pop.title():	## <state>pop = CLRJ</state>
            return pop	## <state>pop = CLRJ</state>
    return pop