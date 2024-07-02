def f(text, suffix):
    text += suffix
    while text[-len(suffix):] == suffix:
        text = text[:-1]
    return text
f('faqo osax f', 'f')