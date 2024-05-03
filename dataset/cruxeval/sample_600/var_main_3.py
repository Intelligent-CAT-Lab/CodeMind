def f(array):
    just_ns = list(map(lambda num: 'n'*num, array))	## <state>just_ns = CLRJ | array = CLRJ</state>
    final_output = []	## <state>final_output = CLRJ</state>
    for wipe in just_ns:	## <state>just_ns = CLRJ</state>
        final_output.append(wipe)
    return final_output	## <state>final_output = CLRJ</state>
