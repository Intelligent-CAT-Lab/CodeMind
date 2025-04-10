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


    def delete_ticket(self, ticket_id):
        self.cursor.execute('''
            DELETE FROM tickets WHERE id = ?
        ''', (ticket_id,))
        self.connection.commit()