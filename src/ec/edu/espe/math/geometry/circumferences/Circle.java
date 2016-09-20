package ec.edu.espe.math.geometry.circumferences;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Circle extends  Circumference {

    public Circle(Float radio) {
        super(radio);
    }

    @Override
    public Float perimeter() {
        return (float)(Math.PI * 2 * this.radio);
    }

    @Override
    public Float area() {
        return (float) (Math.PI * Math.pow(radio,2));
    }
}
