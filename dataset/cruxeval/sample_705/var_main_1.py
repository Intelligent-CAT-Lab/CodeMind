def f(cities, name):
    if not name:	## name = CLRJ
        return cities
    if name and name != 'cities':	## name = CLRJ
        return []
    return [name + city for city in cities]