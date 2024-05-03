def bf(planet1, planet2):
    planet_names = ("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")	## planet_names = CLRJ
    if planet1 not in planet_names or planet2 not in planet_names or planet1 == planet2:	## planet1 = CLRJ|planet_names = CLRJ|planet2 = CLRJ
        return ()
    planet1_index = planet_names.index(planet1)	## planet1_index = CLRJ|planet_names = CLRJ|planet1 = CLRJ
    planet2_index = planet_names.index(planet2)	## planet2_index = CLRJ|planet_names = CLRJ|planet2 = CLRJ
    if planet1_index < planet2_index:	## planet1_index = CLRJ|planet2_index = CLRJ
        return (planet_names[planet1_index + 1: planet2_index])	## planet_names = CLRJ|planet1_index = CLRJ|planet2_index = CLRJ
    else:
        return (planet_names[planet2_index + 1 : planet1_index])
