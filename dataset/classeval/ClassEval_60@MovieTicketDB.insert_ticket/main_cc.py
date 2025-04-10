import sqlite3
class MovieTicketDB: 
    def __init__(self, db_name):
        """
        Initializes the MovieTicketDB object with the specified database name.
        :param db_name: str, the name of the SQLite database.
        """
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()
        self.create_table()


    def insert_ticket(self, movie_name, theater_name, seat_number, customer_name):
        self.cursor.execute('''
            INSERT INTO tickets (movie_name, theater_name, seat_number, customer_name)
            VALUES (?, ?, ?, ?)
        ''', (movie_name, theater_name, seat_number, customer_name))
        self.connection.commit()