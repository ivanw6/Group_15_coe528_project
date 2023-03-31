package FinalProject;

/**
 *
 * @author ivanu
 */
public class Customer {

    private String username;
    private String password;
    private int points;
    private String status;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }
}
