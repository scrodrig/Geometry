package ec.edu.espe.math.geometry.shapes.triangles;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class EquilateralTriangle extends Triangle {

    private Float sideOne;

    @Override
    public Float perimeter() {
        return 3 * this.sideOne;
    }

    @Override
    public Float area() {
        return (float) (Math.sqrt(3/4) * Math.pow(this.sideOne, 2));
    }

    public EquilateralTriangle(Float sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    public Float getSideOne() {
        return sideOne;
    }

    @Override
    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EquilateralTriangle that = (EquilateralTriangle) o;

        return sideOne != null ? sideOne.equals(that.sideOne) : that.sideOne == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sideOne != null ? sideOne.hashCode() : 0);
        return result;
    }
}
