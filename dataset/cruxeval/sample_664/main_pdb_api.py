def f(tags):
    resp = ""
    for key in tags:
        resp += key + " "
    return resp
f({"3":"3","4":"5"})