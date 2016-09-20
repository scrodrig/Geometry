package ec.edu.espe.math.geometry.shapes.quadrilaterals;

/**
 * Created by SchubertDavidRodriguez on 9/19/16.
 */
public class Square extends Quadrilateral {

    protected Float side;


    public Square(Float side) {
        this.side = side;
    }

    @Override
    public Float perimeter() {
        return 4 * this.side;
    }

    @Override
    public Float area() {
        return this.side * this.side;
    }

    public Float getSide() {
        return this.side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return side != null ? side.equals(square.side) : square.side == null;

    }

    @Override
    public int hashCode() {
        return side != null ? side.hashCode() : 0;
    }
}
