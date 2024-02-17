countries = {}
language_country = dict()
for country, language in countries.items():
    if language not in language_country:
        language_country[language] = []
    language_country[language].append(country)
print(language_country)