
import java.net.InetAddress;
/**
 *
 * @author trala
 */
public class OwnIp {
    public static void main(String[] args) {
        try {
            InetAddress myAI= InetAddress.getLocalHost();
            System.out.println(myAI.toString());
            System.out.println(myAI.isAnyLocalAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
