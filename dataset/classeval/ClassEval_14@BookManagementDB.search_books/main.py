import unittest
import sqlite3

class BookManagementDB:
    def __init__(self, db_name):
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()
        self.create_table()

    def create_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS books (
                id INTEGER PRIMARY KEY,
                title TEXT,
                author TEXT,
                available INTEGER
            )
        ''')
        self.connection.commit()

    def add_book(self, title, author):
        self.cursor.execute('''
            INSERT INTO books (title, author, available)
            VALUES (?, ?, 1)
        ''', (title, author))
        self.connection.commit()

    def remove_book(self, book_id):
        self.cursor.execute('''
            DELETE FROM books WHERE id = ?
        ''', (book_id,))
        self.connection.commit()

    def borrow_book(self, book_id):
        self.cursor.execute('''
            UPDATE books SET available = 0 WHERE id = ?
        ''', (book_id,))
        self.connection.commit()

    def return_book(self, book_id):
        self.cursor.execute('''
            UPDATE books SET available = 1 WHERE id = ?
        ''', (book_id,))
        self.connection.commit()

    def search_books(self):
        self.cursor.execute('''
            SELECT * FROM books
        ''')
        books = self.cursor.fetchall()
        return books
class Test(unittest.TestCase):
    def test(self):
            self.db_name = "test.db"
            self.db = BookManagementDB(self.db_name)
            self.connection = sqlite3.connect(self.db_name)
            self.cursor = self.connection.cursor()
            # Add some books for testing search
            self.db.add_book("Book 1", "Author 1")
            self.db.add_book("Book 2", "Author 2")
            self.db.add_book("Book 3", "Author 3")
            books = self.db.search_books()
            # Ensure that all books were retrieved
            # Ensure that the correct book information is retrieved
            return len(books),books[0][1],books[1][2],books[2][3]