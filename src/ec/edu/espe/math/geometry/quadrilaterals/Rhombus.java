package ec.edu.espe.math.geometry.quadrilaterals;


/**
 * Created by SchubertDavidRodriguez on 9/19/16.
 */
public class Rhombus extends Quadrilateal {

    private Float smallDiagonal;

    private Float bigDiagonal;

    public Rhombus(Float smallDiagonal, Float bigDiagonal) {
        this.smallDiagonal = smallDiagonal;
        this.bigDiagonal = bigDiagonal;
    }

    @Override
    public Float perimeter() {
        return  (float) (Math.sqrt(Math.pow((smallDiagonal/2),2) + Math.pow((this.bigDiagonal /2),2)) * 4);
    }

    @Override
    public Float area() {
        return (this.smallDiagonal *  this.bigDiagonal)/2;
    }

    public Float getSmallDiagonal() {
        return smallDiagonal;
    }

    public void setSmallDiagonal(Float smallDiagonal) {
        this.smallDiagonal = smallDiagonal;
    }

    public Float getBigDiagonal() {
        return bigDiagonal;
    }

    public void setBigDiagonal(Float bigDiagonal) {
        this.bigDiagonal = bigDiagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhombus rhombus = (Rhombus) o;

        if (smallDiagonal != null ? !smallDiagonal.equals(rhombus.smallDiagonal) : rhombus.smallDiagonal != null)
            return false;
        return bigDiagonal != null ? bigDiagonal.equals(rhombus.bigDiagonal) : rhombus.bigDiagonal == null;

    }

    @Override
    public int hashCode() {
        int result = smallDiagonal != null ? smallDiagonal.hashCode() : 0;
        result = 31 * result + (bigDiagonal != null ? bigDiagonal.hashCode() : 0);
        return result;
    }
}
