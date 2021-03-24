public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Book book1 = new Book("Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", 423);
        Book book2 = new Book("A Song of Ice And Fire", "George R. R. Martin", 694);
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 223);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        User user1 = new User("Johnson", "Smith", "fake@email.com");
        user1.addBook(book1);

        User user2 = new User("Billy", "Bob", "worst@email.com");
        user2.addBook(book2);
        user2.addBook(book3);

        lib.addUser(user1);
        lib.addUser(user2);

        Employee emp1 = new Employee("Alyssa", "Ponce", "fake@email2.com", 7, "7", "worstpass");

        lib.addEmployee(emp1);

        System.out.println("Library Status: \n" + lib + "\n");

        System.out.println("User Status Before Upcharge: \n" + lib.getUsers() + "\n");

        user1.overduePayments(5);
        emp1.overduePayments(5);

        System.out.println("User Status After Upcharge: \n" + lib.getUsers() + "\n");

    }
}
}
