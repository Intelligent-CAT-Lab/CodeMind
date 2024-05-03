def f(dictionary):
    dictionary[1049] = 55	## <state>dictionary = CLRJ</state>
    key, value = dictionary.popitem()	## <state>key = CLRJ | value = CLRJ | dictionary = CLRJ</state>
    dictionary[key] = value	## <state>dictionary = CLRJ | key = CLRJ | value = CLRJ</state>
    return dictionary	## <state>dictionary = CLRJ</state>
