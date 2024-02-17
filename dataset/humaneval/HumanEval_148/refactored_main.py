planet1 = "Jupiter"
planet2 = "Neptune"
planet_names = ("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
if planet1 not in planet_names or planet2 not in planet_names or planet1 == planet2:
    print(())
planet1_index = planet_names.index(planet1)
planet2_index = planet_names.index(planet2)
if planet1_index < planet2_index:
    print(planet_names[planet1_index + 1: planet2_index])
else:
    print(planet_names[planet2_index + 1 : planet1_index])