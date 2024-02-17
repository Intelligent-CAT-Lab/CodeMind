def f(cities, name):
    if not name:
        return cities
    if name and name != 'cities':
        return []
    return [name + city for city in cities]