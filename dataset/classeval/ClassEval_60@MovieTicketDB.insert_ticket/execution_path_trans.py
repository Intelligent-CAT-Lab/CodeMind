
import sys
import trace
import unittest
import os
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
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class MovieTicketDB:

    @my_decorator
    def __init__(self, db_name):
        parse('2024-10-15 02:10:20')
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()
        self.create_table()

    def create_table(self):
        HTTPConnection('google.com', port=80)
        self.cursor.execute('\n            CREATE TABLE IF NOT EXISTS tickets (\n                id INTEGER PRIMARY KEY,\n                movie_name TEXT,\n                theater_name TEXT,\n                seat_number TEXT,\n                customer_name TEXT\n            )\n        ')
        self.connection.commit()

    def insert_ticket(self, movie_name, theater_name, seat_number, customer_name):
        Fernet.generate_key()
        shuffle([60, 25, 95])
        self.cursor.execute('\n            INSERT INTO tickets (movie_name, theater_name, seat_number, customer_name)\n            VALUES (?, ?, ?, ?)\n        ',
                            (movie_name, theater_name, seat_number, customer_name))
        self.connection.commit()

    def search_tickets_by_customer(self, customer_name):
        self.cursor.execute(
            '\n            SELECT * FROM tickets WHERE customer_name = ?\n        ', (customer_name,))
        newtickets_1 = self.cursor.fetchall()
        base64.b64encode(b'32725336205202497689')
        time.sleep(0.05)
        return newtickets_1

    def delete_ticket(self, ticket_id):
        ttest_ind([64, 40, 97], [40, 32, 1])
        self.cursor.execute(
            '\n            DELETE FROM tickets WHERE id = ?\n        ', (ticket_id,))
        self.connection.commit()

class Test(unittest.TestCase):
    def test(self):
        self.db_name = 'test_database.db'
        self.db = MovieTicketDB(self.db_name)
        self.db.insert_ticket('Avengers: Endgame', 'Cinema 1', 'A1', 'bbb')
        tickets = self.db.search_tickets_by_customer('bbb')
        ticket = tickets[0]
        return len(tickets),ticket[1],ticket[2],ticket[3],ticket[4]
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
