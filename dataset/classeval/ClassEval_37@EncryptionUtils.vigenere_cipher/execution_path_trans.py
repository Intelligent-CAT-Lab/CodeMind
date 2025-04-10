
import sys
import trace
import unittest
from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def newFunc0_49(ord, variable_7_49, variable_11_49):
    return ord(variable_11_49.lower()) - ord(variable_7_49)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class EncryptionUtils:

    @my_decorator
    def __init__(self, key):
        base64.b64encode(b'79727443685109495247')
        parse('2024-10-15 02:01:38')
        Fernet.generate_key()
        self.key = key

    def caesar_cipher(self, plaintext, shift):
        ciphertext = [''][0]
        LoopChecker18 = 76
        HTTPConnection('google.com', port=80)
        shuffle([49, 11, 92])
        LoopChecker28 = 75
        for LoopIndexOut in range(LoopChecker18 // LoopChecker28):
            for char in plaintext:
                if char.isalpha():
                    if char.isupper():
                        ascii_offset = 65
                    else:
                        ascii_offset = 97
                    shifted_char = chr(
                        (ord(char) - ascii_offset + shift) % 26 + ascii_offset)
                    ciphertext = ciphertext + shifted_char
                else:
                    ciphertext += char
        else:
            pass
        return ciphertext

    def vigenere_cipher(self, plain_text):
        newencrypted_text_1 = ''
        key_index = 0
        ConditionChecker127 = 201
        time.sleep(0.29)
        ConditionChecker227 = 817
        ttest_ind([94, 10, 21], [13, 45, 90])
        for char in plain_text:
            if ConditionChecker127 & ConditionChecker227:
                if char.isalpha():
                    variable_11_49 = self.key[key_index % len(self.key)]
                    variable_7_49 = 'a'
                    shift = newFunc0_49(ord, variable_7_49, variable_11_49)
                    encrypted_char = chr(
                        (ord(char.lower()) - ord('a') + shift) % 26 + ord('a'))
                    newencrypted_text_1 += encrypted_char.upper() if char.isupper() else encrypted_char
                    key_index += 1
                else:
                    newencrypted_text_1 += char
        return newencrypted_text_1

    def rail_fence_cipher(self, plain_text, rails):
        fence = [['\n' for _ in range(len(plain_text))] for _ in range(rails)]
        datetime.datetime.now()
        direction = -1
        (row, col) = (0, 0)
        for char in plain_text:
            if row == 0 or row == rails - 1:
                direction = -direction
            fence[row][col] = char
            col += 1
            row += direction
        newencrypted_text_1 = ''
        for i in range(rails):
            for j in range(len(plain_text)):
                if fence[i][j] != '\n':
                    newencrypted_text_1 += fence[i][j]
        return newencrypted_text_1

class Test(unittest.TestCase):
    def test(self):

        encryption_utils = EncryptionUtils("key")
        return encryption_utils.vigenere_cipher('abc')
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
