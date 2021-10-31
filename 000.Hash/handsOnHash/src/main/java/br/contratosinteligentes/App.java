package br.contratosinteligentes;

import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.util.encoders.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Hello world!
 *
 */
public class App 
{

    final static String frase = "Contratos Inteligentes: Hands on do episódio sobre hash";
    final static String ponto = ".";

    public static void main( String[] args ) throws NoSuchAlgorithmException
    {
        Keccak.Digest256 digest = new Keccak.Digest256();
        byte[] hashFrase = digest.digest(frase.getBytes());
        System.out.println("Keccak 256 da frase: " + new String(Hex.encode(hashFrase)));

        byte[] hashPonto = digest.digest(ponto.getBytes());
        System.out.println("Keccak 256 do ponto: " + new String(Hex.encode(hashPonto)));

        byte[] inputMD5 = frase.getBytes();
        MessageDigest digestMD5 = MessageDigest.getInstance("MD5");
        byte[] hashMD5 = digestMD5.digest(inputMD5);
        System.out.println("MD5 da frase       : " + new String(Hex.encode(hashMD5)));
    }
}
