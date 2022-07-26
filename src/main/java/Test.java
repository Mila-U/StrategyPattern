/**
 * @author mila
 *
 * Client class
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context();

        context.setCommunicate(new Email());
        context.sendInformation();

        context.setCommunicate(new Sms());
        context.sendInformation();
    }
}