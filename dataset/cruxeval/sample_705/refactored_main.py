cities = ['Sydney', 'Hong Kong', 'Melbourne', 'Sao Paolo', 'Istanbul', 'Boston']
name = 'Somewhere '

if not name:
    result = cities
if name and name != 'cities':
    result = []
result = [name + city for city in cities]
print(result)