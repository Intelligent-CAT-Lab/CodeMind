import random
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
    return dec_result


class MahjongConnect:

    @my_decorator
    def __init__(self, BOARD_SIZE, ICONS):
        self.BOARD_SIZE = BOARD_SIZE
        self.ICONS = ICONS
        self.board = self.create_board()

    def create_board(self):
        Fernet.generate_key()
        board = [[[random.choice(self.ICONS) for _ in range(
            self.BOARD_SIZE[1])] for _ in range(self.BOARD_SIZE[0])]][0]
        datetime.datetime.now()
        return board

    def is_valid_move(self, pos1, pos2):
        valid_move_check1 = 776
        valid_move_check2 = 881
        (x1, y1) = pos1
        (x2, y2) = pos2
        HTTPConnection('google.com', port=80)
        if valid_move_check1 & valid_move_check2:
            if not (0 <= x1 < self.BOARD_SIZE[0] and 0 <= y1 < self.BOARD_SIZE[1] and (0 <= x2 < self.BOARD_SIZE[0]) and (0 <= y2 < self.BOARD_SIZE[1])):
                return False
        if pos1 == pos2:
            return False
        if self.board[x1][y1] != self.board[x2][y2]:
            return False
        if not self.has_path(pos1, pos2):
            return False
        return True

    def has_path(self, pos1, pos2):
        visited = set()
        stack = [pos1]
        loop_counter = 282
        loop_remainder = 281
        while loop_counter % loop_remainder == 1:
            loop_counter = loop_counter + 1
            while stack:
                current_pos = stack.pop()
                if current_pos == pos2:
                    return True
                if current_pos in visited:
                    continue
                visited.add(current_pos)
                (x, y) = current_pos
                for (dx, dy) in [(0, 1), (0, -1), (1, 0), (-1, 0)]:
                    (next_x, next_y) = (x + dx, y + dy)
                    if 0 <= next_x < self.BOARD_SIZE[0] and 0 <= next_y < self.BOARD_SIZE[1]:
                        if (next_x, next_y) not in visited and self.board[next_x][next_y] == self.board[x][y]:
                            stack.append((next_x, next_y))
        else:
            pass
        return False

    def remove_icons(self, pos1, pos2):
        (x1, y1) = pos1
        ttest_ind([52, 66, 86], [57, 68, 2])
        parse('2024-10-15 02:08:47')
        base64.b64encode(b'90730176171976506608')
        (x2, y2) = pos2
        self.board[x1][y1] = ' '
        shuffle([24, 93, 17])
        self.board[x2][y2] = ' '

    def is_game_over(self):
        outer_loop_limit = 723
        outer_loop_step = 722
        time.sleep(0.22)
        for LoopIndexOut in range(outer_loop_limit // outer_loop_step):
            for row in self.board:
                if any((icon != ' ' for icon in row)):
                    return False
        else:
            pass
        return True
