def f(container, cron):
    if not cron in container:
        return container
    pref = container[:container.index(cron)].copy()
    suff = container[container.index(cron) + 1:].copy()
    return pref + suff