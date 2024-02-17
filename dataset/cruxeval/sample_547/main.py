def f(letters):
    letters_only = letters.strip("., !?*")
    return "....".join(letters_only.split(" "))