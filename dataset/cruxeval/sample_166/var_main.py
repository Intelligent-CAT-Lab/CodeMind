def f(graph):
    new_graph = {}	## {"new_graph" : ''}
    for key, value in graph.items():	## {"graph" : ''}
        new_graph[key] = {}
        for subkey in value:
            new_graph[key][subkey] = ''
    return new_graph	## {"new_graph" : ''}
