def test(self):
        self.db_name = "test.db"
        self.db = BookManagementDB(self.db_name)
        self.connection = sqlite3.connect(self.db_name)
        self.cursor = self.connection.cursor()
        title = "Introduction to Python"
        author = "John Smith"
        self.db.add_book(title, author)

        # Check if the book was added correctly
        self.cursor.execute("SELECT title, author, available FROM books WHERE id=1")
        result = self.cursor.fetchone()
        return result,result[0],title,result[1],author,result[2]