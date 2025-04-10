import unittest
class GomokuGame:
    def __init__(self, board_size):
        self.board_size = board_size
        self.board = [[' ' for _ in range(board_size)] for _ in range(board_size)]
        self.current_player = 'X'

    def make_move(self, row, col):
        if self.board[row][col] == ' ':
            self.board[row][col] = self.current_player
            self.current_player = 'O' if self.current_player == 'X' else 'X'
            return True
        return False

    def check_winner(self):
        directions = [(0, 1), (1, 0), (1, 1), (1, -1)]
        for row in range(self.board_size):
            for col in range(self.board_size):
                if self.board[row][col] != ' ':
                    for direction in directions:
                        if self._check_five_in_a_row(row, col, direction):
                            return self.board[row][col]
        return None

    def _check_five_in_a_row(self, row, col, direction):
        dx, dy = direction
        count = 1
        symbol = self.board[row][col]
        for i in range(1, 5):
            new_row = row + dx * i
            new_col = col + dy * i
            if not (0 <= new_row < self.board_size and 0 <= new_col < self.board_size):
                return False
            if self.board[new_row][new_col] != symbol:
                return False
            count += 1
        return count == 5
class Test(unittest.TestCase):
    def test(self):
            self.gomokuGame = GomokuGame(10)
            moves = [(5, 5), (0, 0), (5, 4), (0, 1), (5, 3), (0, 2), (5, 2), (0, 3), (5, 1)]
            for move in moves:
                self.gomokuGame.make_move(move[0], move[1])
            return self.gomokuGame._check_five_in_a_row(5, 5, (1, 0))