def f(graph):
    new_graph = {}
    for key, value in graph.items():
        new_graph[key] = {}
        for subkey in value:
            new_graph[key][subkey] = ''
    return new_graph