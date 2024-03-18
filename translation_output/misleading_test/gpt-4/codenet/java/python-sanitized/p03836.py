def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    # Define a helper function to repeat a character c, n times
    def repeat_char(c, n):
        return c * n
    
    # Start building the path sequence
    path = []
    # sx < tx, sy < ty so we can follow a specific pattern
    # first
    path.append( repeat_char('R', dx) )
    path.append( repeat_char('U', dy) )
    
    # second
    path.append( repeat_char('L', dx) )
    path.append( repeat_char('D', dy) )
    
    # third
    path.append( repeat_char('D', 1) )
    path.append( repeat_char('R', dx + 1) )
    path.append( repeat_char('U', dy + 1) )
    path.append( repeat_char('L', 1) )
    
    # forth
    path.append( repeat_char('U', 1) )
    path.append( repeat_char('L', dx + 1) )
    path.append( repeat_char('D', dy + 1) )
    path.append( repeat_char('R', 1) )
    
    return ''.join(path)

# Test input
sx, sy, tx, ty = map(int, input().split())

# Output the solution
print(solve(sx, sy, tx, ty))