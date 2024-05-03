def f(cities, name):
    if not name:	## <state>name = CLRJ</state>
        return cities
    if name and name != 'cities':	## <state>name = CLRJ</state>
        return []
    return [name + city for city in cities]