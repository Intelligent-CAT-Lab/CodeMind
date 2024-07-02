def f(text):
    return text.ljust(len(text) + 1, "#")
f("the cow goes moo")