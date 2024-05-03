def f(letters):
    letters_only = letters.strip("., !?*")	## <state>letters_only = CLRJ | letters = CLRJ</state>
    return "....".join(letters_only.split(" "))	## <state>letters_only = CLRJ</state>
