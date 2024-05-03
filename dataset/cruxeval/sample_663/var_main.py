def f(container, cron):
    if not cron in container:	## {"cron" : '',"container" : ''}
        return container	## {"container" : ''}
    pref = container[:container.index(cron)].copy()
    suff = container[container.index(cron) + 1:].copy()
    return pref + suff