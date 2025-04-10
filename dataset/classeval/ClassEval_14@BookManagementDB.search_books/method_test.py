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