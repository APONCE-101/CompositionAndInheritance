public class Employee extends User {


    private int ptoDays;
    private String Username;
    private String password ;

    public Employee(String firstName, String lastName, String email, int userid,
                    int ptoDays, String username, String password) {
        super(firstName, lastName, email, userid);
        this.ptoDays = ptoDays;
        this.Username = username;
        this.password = password;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void overduePayments(int day) {
        setBalanceUnpaid(getBalanceUnpaid() + 0.10 * day);
    }
}
