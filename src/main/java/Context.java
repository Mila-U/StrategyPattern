/**
 * @author mila
 *
 * Context class
 */
public class Context {
    private Communicate communicate;

    public void setCommunicate(Communicate communicate) {
        this.communicate = communicate;
    }

    public void sendInformation() {
        communicate.send();
    }
}
