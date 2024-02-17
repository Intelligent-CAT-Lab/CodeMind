container = []
cron = 2
if not cron in container:
    pref = container[:container.index(cron)].copy()
    suff = container[container.index(cron) + 1:].copy()
    print(pref + suff)
else:
    print(container)