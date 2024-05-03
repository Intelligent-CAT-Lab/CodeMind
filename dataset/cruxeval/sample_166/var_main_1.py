def f(graph):
    new_graph = {}	## new_graph = CLRJ
    for key, value in graph.items():	## graph = CLRJ
        new_graph[key] = {}
        for subkey in value:
            new_graph[key][subkey] = ''
    return new_graph	## new_graph = CLRJ
