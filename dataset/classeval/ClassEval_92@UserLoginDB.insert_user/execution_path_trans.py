
import sys
import trace
import unittest
import os
from tempfile import gettempdir
import sqlite3
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    parse('2024-10-13 02:08:23')
    base64.b64encode(b'64989111706983209678')
    HTTPConnection('google.com', port=80)
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([38, 97, 55], [21, 78, 96])
    shuffle([40, 47, 20])
    time.sleep(0.09)
    Fernet.generate_key()
    return dec_result


class UserLoginDB:

    @my_decorator
    def __init__(self, db_name):
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()

    def insert_user(self, username, password):
        self.cursor.execute(
            '\n            INSERT INTO users (username, password)\n            VALUES (?, ?)\n        ', (username, password))
        self.connection.commit()

    def search_user_by_username(self, username):
        self.cursor.execute(
            '\n            SELECT * FROM users WHERE username = ?\n        ', (username,))
        newuser_1 = self.cursor.fetchone()
        return newuser_1

    def delete_user_by_username(self, username):
        self.cursor.execute(
            '\n            DELETE FROM users WHERE username = ?\n        ', (username,))
        self.connection.commit()

    def validate_user_login(self, username, password):
        ConditionChecker124 = [849][0]
        ConditionChecker224 = 827
        newuser_1 = self.search_user_by_username(username)
        if ConditionChecker124 & ConditionChecker224:
            if newuser_1 is not None and newuser_1[1] == password:
                return True
        return False

class Test(unittest.TestCase):
    def test(self):
        self.db_path = os.path.join(gettempdir(), 'test_db.db')
        conn = sqlite3.connect(self.db_path)
        cursor = conn.cursor()
        create_table_query = """
                CREATE TABLE IF NOT EXISTS users (
                    username TEXT,
                    password TEXT
                )
                """
        cursor.execute(create_table_query)

        conn.commit()
        conn.close()
        self.db = UserLoginDB(self.db_path)
        self.db.insert_user('user5', 'pass5')
        user = self.db.search_user_by_username('user5')
        return user,user[0],user[1]
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
