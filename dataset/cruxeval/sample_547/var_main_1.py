def f(letters):
    letters_only = letters.strip("., !?*")	## letters_only = CLRJ | letters = CLRJ
    return "....".join(letters_only.split(" "))	## letters_only = CLRJ
