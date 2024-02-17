def f(countries):
    language_country = dict()
    for country, language in countries.items():
        if language not in language_country:
            language_country[language] = []
        language_country[language].append(country)
    return language_country