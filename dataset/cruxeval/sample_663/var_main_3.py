def f(container, cron):
    if not cron in container:	## <state>cron = CLRJ | container = CLRJ</state>
        return container	## <state>container = CLRJ</state>
    pref = container[:container.index(cron)].copy()
    suff = container[container.index(cron) + 1:].copy()
    return pref + suff