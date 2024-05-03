def f(graph):
    new_graph = {}	## <state>new_graph = CLRJ</state>
    for key, value in graph.items():	## <state>graph = CLRJ</state>
        new_graph[key] = {}
        for subkey in value:
            new_graph[key][subkey] = ''
    return new_graph	## <state>new_graph = CLRJ</state>
