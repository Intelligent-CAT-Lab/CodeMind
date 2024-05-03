def f(dictionary):
    while not dictionary.get(1, len(dictionary)):	## <state>dictionary = CLRJ</state>
        dictionary.clear()
        break
    return dictionary	## <state>dictionary = CLRJ</state>
