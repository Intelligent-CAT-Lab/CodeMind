def f(letters):
    letters_only = letters.strip("., !?*")	## letters_only = [] | letters = []
    return "....".join(letters_only.split(" "))	## letters_only = []
