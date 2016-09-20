package ec.edu.espe.main;

import ec.edu.espe.math.geometry.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.quadrilaterals.Square;
import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square square = new Square(5f);
        PrinterUtil.print(square.getClass().getSimpleName(), GeometricConstants.PERIMITER,square.perimeter());
        PrinterUtil.print(square.getClass().getSimpleName(), GeometricConstants.AREA,square.area());

        Rectangle rectangle = new Rectangle(5f,3f);
        PrinterUtil.print(rectangle.getClass().getSimpleName(), GeometricConstants.PERIMITER,rectangle.perimeter());
        PrinterUtil.print(rectangle.getClass().getSimpleName(), GeometricConstants.AREA,rectangle.area());
    }
}
