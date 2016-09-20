package ec.edu.espe.math.geometry.solids.circumferences;

import ec.edu.espe.math.geometry.shapes.circumferences.Circumference;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Sphere extends Circumference implements CircumferenceSolidInterfaceInterface {

    public Sphere(Float radio) {
        super(radio);
    }

    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float area() {
        return (float) (4 * Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public Float volume() {
        return (float) ((4 * Math.PI * Math.pow(this.radio, 3)) / 3);
    }


}
