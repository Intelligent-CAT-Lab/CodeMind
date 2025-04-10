def test(self):
        self.db_name = 'test_database.db'
        self.db = MovieTicketDB(self.db_name)
        self.db.insert_ticket('Avengers: Endgame', 'Cinema 1', 'A1', 'John Doe')
        tickets = self.db.search_tickets_by_customer('John Doe')
        ticket = tickets[0]
        ticket_id = tickets[0][0]
        self.db.delete_ticket(ticket_id)
        tickets = self.db.search_tickets_by_customer('John Doe')
        return len(tickets),ticket[1],ticket[2],ticket[3],ticket[4],len(tickets)