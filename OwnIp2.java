
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author trala
 */
public class OwnIp2 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface>
            listNi=NetworkInterface.getNetworkInterfaces();
            while (listNi.hasMoreElements()){
                NetworkInterface nic=listNi.nextElement();
                System.out.println("Network interface : ");
                System.out.println(nic.toString());
                Enumeration<InetAddress> listIa=nic.getInetAddresses();
                while(listIa.hasMoreElements()){
                    InetAddress iac=listIa.nextElement();
                    System.out.println("++++++ InetAdress : ");
                System.out.println("+++++ " + iac.toString());
                if (iac instanceof Inet4Address){
                    System.out.println("Ipv4");
                }
                if(iac.isLoopbackAddress()){
                    System.out.println("LoopbackAddress");
                }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
