def f(replace, text, hide):
    while hide in text:
        replace += 'ax'
        text = text.replace(hide, replace, 1)
    return text