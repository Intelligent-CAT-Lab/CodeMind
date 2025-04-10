
class EightPuzzle: 
    def __init__(self, initial_state):
        """
        Initializing the initial state of Eight Puzzle Game, stores in attribute self.initial_state.
        And set the goal state of this game, stores in self.goal_state. In this case, set the size as 3*3
        :param initial_state: a 3*3 size list of Integer, stores the initial state
        """
        self.initial_state = initial_state
        self.goal_state = [[1, 2, 3], [4, 5, 6], [7, 8, 0]]

    def solve(self):
        open_list = [(self.initial_state, [])]
        closed_list = []

        while open_list:
            current_state, path = open_list.pop(0)
            closed_list.append(current_state)

            if current_state == self.goal_state:
                return path

            for move in self.get_possible_moves(current_state):
                new_state = self.move(current_state, move)
                if new_state not in closed_list:
                    open_list.append((new_state, path + [move]))

        return None
    def move(self, state, direction):
        i, j = self.find_blank(state)
        new_state = [row[:] for row in state]

        if direction == 'up':
            new_state[i][j], new_state[i - 1][j] = new_state[i - 1][j], new_state[i][j]
        elif direction == 'down':
            new_state[i][j], new_state[i + 1][j] = new_state[i + 1][j], new_state[i][j]
        elif direction == 'left':
            new_state[i][j], new_state[i][j - 1] = new_state[i][j - 1], new_state[i][j]
        elif direction == 'right':
            new_state[i][j], new_state[i][j + 1] = new_state[i][j + 1], new_state[i][j]

        return new_state
    def get_possible_moves(self, state):
        moves = []
        i, j = self.find_blank(state)

        if i > 0:
            moves.append('up')
        if i < 2:
            moves.append('down')
        if j > 0:
            moves.append('left')
        if j < 2:
            moves.append('right')

        return moves