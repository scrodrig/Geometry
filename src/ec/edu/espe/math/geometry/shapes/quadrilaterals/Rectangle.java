package ec.edu.espe.math.geometry.shapes.quadrilaterals;

/**
 * Created by SchubertDavidRodriguez on 9/19/16.
 */
public class Rectangle extends Quadrilateral {

    private Float base;

    private Float height;

    public Rectangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Float perimeter() {
        return 2 * (this.base + this.height);
    }

    @Override
    public Float area() {
        return this.base * this.height;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
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

        Rectangle rectangle = (Rectangle) o;

        if (!base.equals(rectangle.base)) return false;
        return height.equals(rectangle.height);

    }

    @Override
    public int hashCode() {
        int result = base.hashCode();
        result = 31 * result + height.hashCode();
        return result;
    }
}
