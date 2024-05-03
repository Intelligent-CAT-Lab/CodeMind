def f(text):
    topic, sep, problem = text.rpartition('|')	## topic = [] | sep = [] | problem = [] | text = []
    if problem == 'r':	## problem = []
        problem = topic.replace('u', 'p')
    return topic, problem	## topic = [] | problem = []
