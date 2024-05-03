def f(cities, name):
    if not name:	## name = []
        return cities
    if name and name != 'cities':	## name = []
        return []
    return [name + city for city in cities]