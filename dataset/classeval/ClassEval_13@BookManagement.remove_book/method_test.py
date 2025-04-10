def test(self):
        self.bookManagement = BookManagement()
        self.bookManagement.add_book("book1", 2)
        self.bookManagement.add_book("book2")
        self.bookManagement.remove_book("book1", 2)
        return self.bookManagement.inventory