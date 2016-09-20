package ec.edu.espe.util;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class PrinterUtil {

    public static void print(String shapeName, String shapeParameter, Float shapeValue){
        System.out.println(shapeParameter +" of "+ shapeName + ": " + shapeValue);
    }
}
