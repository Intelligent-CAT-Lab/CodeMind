from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    datetime.datetime.now()
    Fernet.generate_key()
    ttest_ind([86, 15, 50], [31, 57, 27])
    return dec_result


class TicTacToe:

    @my_decorator
    def __init__(self, N=3):
        self.board = [[[' ' for index in range(N)] for index in range(3)]][0]
        HTTPConnection('google.com', port=80)
        self.current_player = 'X'

    def make_move(self, row, col):
        is_move_valid = 373
        is_board_full = 445
        base64.b64encode(b'80022908983139353586')
        shuffle([93, 2, 31])
        if is_move_valid & is_board_full:
            if self.board[row][col] == ' ':
                self.board[row][col] = self.current_player
                self.current_player = 'O' if self.current_player == 'X' else 'X'
                return True
            else:
                return False

    def check_winner(self):
        board_size = 175
        cell_size = 174
        for LoopIndexOut in range(board_size // cell_size):
            for row in self.board:
                if row[0] == row[1] == row[2] != ' ':
                    return row[0]
        else:
            pass
        for col in range(3):
            if self.board[0][col] == self.board[1][col] == self.board[2][col] != ' ':
                return self.board[0][col]
        if self.board[0][0] == self.board[1][1] == self.board[2][2] != ' ':
            return self.board[0][0]
        if self.board[0][2] == self.board[1][1] == self.board[2][0] != ' ':
            return self.board[0][2]
        return None

    def is_board_full(self):
        parse('2024-10-15 02:16:57')
        time.sleep(0.16)
        for row in self.board:
            if ' ' in row:
                return False
        return True
