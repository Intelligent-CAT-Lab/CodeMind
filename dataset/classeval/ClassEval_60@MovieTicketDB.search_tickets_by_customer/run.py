import os
import unittest
import sqlite3


class MovieTicketDB:
    def __init__(self, db_name):
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()
        self.create_table()

    def create_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS tickets (
                id INTEGER PRIMARY KEY,
                movie_name TEXT,
                theater_name TEXT,
                seat_number TEXT,
                customer_name TEXT
            )
        ''')
        self.connection.commit()

    def insert_ticket(self, movie_name, theater_name, seat_number, customer_name):
        self.cursor.execute('''
            INSERT INTO tickets (movie_name, theater_name, seat_number, customer_name)
            VALUES (?, ?, ?, ?)
        ''', (movie_name, theater_name, seat_number, customer_name))
        self.connection.commit()

    def search_tickets_by_customer(self, customer_name):
        self.cursor.execute('''
            SELECT * FROM tickets WHERE customer_name = ?
        ''', (customer_name,))
        tickets = self.cursor.fetchall()
        return tickets

    def delete_ticket(self, ticket_id):
        self.cursor.execute('''
            DELETE FROM tickets WHERE id = ?
        ''', (ticket_id,))
        self.connection.commit()
class Test(unittest.TestCase):
    def test(self):
            self.db_name = 'test_database.db'
            self.db = MovieTicketDB(self.db_name)
            self.db.insert_ticket('Avengers: Endgame', 'Cinema 1', 'A1', 'ddd')
            tickets = self.db.search_tickets_by_customer('ddd')
            ticket_id = tickets[0][0]
            self.db.delete_ticket(ticket_id)
            tickets = self.db.search_tickets_by_customer('ddd')
            return len(tickets),len(tickets)
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_60@MovieTicketDB.search_tickets_by_customer/output.txt', 'w') as wr:
    wr.write(str(a))
        