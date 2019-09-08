import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Programa que encripta usando Blowfish
 * (PROTOTIPO)
 */
public class JBlowfish {

	public static void main(String[] args) throws Exception {

		String Key = "ABCDEFGH";
		byte[] KeyData = Key.getBytes();
		SecretKeySpec KS = new SecretKeySpec(KeyData, "Blowfish");

		Cipher cipher = Cipher.getInstance("Blowfish");

		cipher.init(Cipher.ENCRYPT_MODE, KS);

		// Texto 
		String inputText = "security";

		byte[] encrypted = cipher.doFinal(inputText.getBytes());

		System.out.println("Texto encriptado: " + new String(encrypted));

		// Terminar
		System.exit(0);
	}
}