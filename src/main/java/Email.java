/**
 * @author mila
 *
 * Concrete algorithm class
 */
public class Email implements Communicate {
    @Override
    public void send() {
        System.out.println("Email is sent");
    }
}