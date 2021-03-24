public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int userID;
    private double balanceUnpaid;


    public User(String firstName, String lastName, String email, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userID = userID;
        balanceUnpaid = 0;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getBalanceUnpaid() {
        return balanceUnpaid;
    }

    public void setBalanceUnpaid(double balanceUnpaid) {
        this.balanceUnpaid = balanceUnpaid;
    }
    public void overduePayments(int day) {
        this.balanceUnpaid += 0.50 * day;
    }

}
