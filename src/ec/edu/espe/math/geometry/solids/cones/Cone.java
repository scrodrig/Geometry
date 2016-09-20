package ec.edu.espe.math.geometry.solids.cones;

import ec.edu.espe.math.geometry.shapes.circumferences.Circumference;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Cone extends Circumference implements ConeSolidInterface {

    private  Float height;

    private Float side;

    public Cone(Float radio, Float height, Float side) {
        super(radio);
        this.height = height;
        this.side = side;
    }

    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float area() {
        return (float) (Math.PI * this.radio * this.side);
    }

    @Override
    public Float volume() {
        return (float) ((Math.PI * Math.pow(this.radio,2) * this.height)/3);
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (height != null ? !height.equals(cone.height) : cone.height != null) return false;
        return side != null ? side.equals(cone.side) : cone.side == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (side != null ? side.hashCode() : 0);
        return result;
    }
}
