def f(values, value):
    length = len(values)	## <state>length = CLRJ | values = CLRJ</state>
    new_dict = dict.fromkeys(values, value)	## <state>new_dict = CLRJ | values = CLRJ | value = CLRJ</state>
    new_dict[''.join(sorted(values))] = value * 3	## <state>new_dict = CLRJ | values = CLRJ | value = CLRJ</state>
    return new_dict	## <state>new_dict = CLRJ</state>
