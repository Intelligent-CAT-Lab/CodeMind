def f(countries):
    language_country = dict()	## <state>language_country = CLRJ</state>
    for country, language in countries.items():	## <state>countries = CLRJ</state>
        if language not in language_country:
            language_country[language] = []
        language_country[language].append(country)
    return language_country	## <state>language_country = CLRJ</state>
