package ec.edu.espe.math.geometry.solids.cylinders;

import ec.edu.espe.math.geometry.shapes.circumferences.Circumference;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Cylinder extends Circumference implements CylinderSolidInterfaceInterface {

    private Float height;

    public Cylinder(Float radio, Float height) {
        super(radio);
        this.height = height;
    }

    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float area() {
        return (float) (2* Math.PI * this.radio * (this.radio + this.height));
    }

    @Override
    public Float volume() {
        return (float) (Math.PI * Math.pow(this.radio,2) * this.height);
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        return height != null ? height.equals(cylinder.height) : cylinder.height == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}
