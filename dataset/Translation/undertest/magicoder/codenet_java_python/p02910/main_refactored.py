class main:
    def check_path(path):
        for i in range(len(path)):
            if i % 2 == 0:
                if path[i] == 'L':
                    return "No"
            else:
                if path[i] == 'R':
                    return "No"
        return "Yes"
    
    # Test input
    print(check_path("RUDLUDR"))