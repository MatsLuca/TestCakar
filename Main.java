
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.math.*;
import tools.*;

public class Main
{
    public static void main(String args[]){
        JConsole jc = new JConsole();
        
        int obereGrenze = 100;
        BigInteger mult = new BigInteger("1");
        
        for(int i = 1; 1 <= obereGrenze; ++i){
            String param = String.valueOf(i);
            mult = mult.multiply(new BigInteger(param));
        }
        
        jc.println("Mult = " + mult);
        
        // Master update 1
 
    }
}
