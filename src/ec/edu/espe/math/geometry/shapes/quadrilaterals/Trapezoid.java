package ec.edu.espe.math.geometry.shapes.quadrilaterals;

/**
 * Created by SchubertDavidRodriguez on 9/19/16.
 */
public class Trapezoid extends Quadrilateral {

    private Float smallSide;

    private Float bigSide;

    private Float height;

    public Trapezoid(Float smallSide, Float bigSide, Float height) {
        this.smallSide = smallSide;
        this.bigSide = bigSide;
        this.height = height;
    }

    @Override
    public Float perimeter() {
        return 2 * (this.smallSide + this.bigSide);
    }

    @Override
    public Float area() {
        return (this.height * (this.smallSide * this.bigSide))/2;
    }

    public Float getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(Float smallSide) {
        this.smallSide = smallSide;
    }

    public Float getBigSide() {
        return bigSide;
    }

    public void setBigSide(Float bigSide) {
        this.bigSide = bigSide;
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

        Trapezoid trapezoid = (Trapezoid) o;

        if (smallSide != null ? !smallSide.equals(trapezoid.smallSide) : trapezoid.smallSide != null) return false;
        if (bigSide != null ? !bigSide.equals(trapezoid.bigSide) : trapezoid.bigSide != null) return false;
        return height != null ? height.equals(trapezoid.height) : trapezoid.height == null;

    }

    @Override
    public int hashCode() {
        int result = smallSide != null ? smallSide.hashCode() : 0;
        result = 31 * result + (bigSide != null ? bigSide.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}
