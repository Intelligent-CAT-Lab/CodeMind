def test(self):

        bookManagement = BookManagement()
        bookManagement.add_book("book1", 2)
        bookManagement.add_book("book1")
        return bookManagement.inventory