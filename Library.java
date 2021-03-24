import java.util.ArrayList;


public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Employee> employees;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(books.indexOf(book));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(users.indexOf(user));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employees.indexOf(employee));
    }

    public String toString() {
        return "Books: " + books.toString()
                + "\nUsers: " + users.toString()
                + "\nEmployees: " + employees.toString();
    }

}
