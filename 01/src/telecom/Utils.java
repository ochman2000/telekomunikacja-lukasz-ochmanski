package telecom;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Przemek
 */
public class Utils {

     
    public static String convertWithPad(byte[] nazwa) {
    	String binarka = "";
        for (int i=0; i<nazwa.length; i++) {
        	binarka=binarka+convertByteToString(nazwa[i]);
        	binarka+=" ";
		}
        return binarka;
    }
    
    private static String convertByteToString(byte b) {
    	byte[] bity = new byte[1];
    	bity[0]=b;
		BigInteger bigint = new BigInteger(bity);
		String binarka = bigint.toString(2);
		String bajt="00000000";
		binarka=bajt+binarka;
		binarka = binarka.substring(binarka.length()-8, binarka.length());
        return binarka;
	}
    
    public static int getBitAt(byte[] b, int index) {
    	BigInteger bi = new BigInteger(b);
    	boolean bit = bi.testBit(index);
    	if (bit==true)
    		return 1;
    	else
    		return 0;
    }
}