def f(text):
    topic, sep, problem = text.rpartition('|')	## topic = CLRJ | sep = CLRJ | problem = CLRJ | text = CLRJ
    if problem == 'r':	## problem = CLRJ
        problem = topic.replace('u', 'p')
    return topic, problem	## topic = CLRJ | problem = CLRJ
