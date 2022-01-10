/* ***********************************************
	CREATION DE PAIRE DE CLE DE CHIFFREMENT
   ***********************************************
*/
import java.io.IOException; 
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.KeyPair; 
import java.security.KeyPairGenerator; 
import java.security.PrivateKey; 
import java.security.PublicKey;
import java.util.Enumeration;
/**
 *
 * @author trala
 */
public class keyPair {
    public static void main(String[] args) {
     try{ 
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); //RSA,MD5withRSA
        keyGen.initialize(1024); 
        KeyPair keypair = keyGen.genKeyPair(); 
        PrivateKey privateKey = keypair.getPrivate(); 
        System.out.println(privateKey); 
        PublicKey publicKey = keypair.getPublic(); 
        System.out.println(publicKey); 
        } 
      catch (Exception e) {
          System.out.println("Erreur! ");
      }
            
   
    
            }
}
    