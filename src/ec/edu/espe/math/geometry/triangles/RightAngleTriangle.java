package ec.edu.espe.math.geometry.triangles;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class RightAngleTriangle extends Triangle {

    private Float base;

    private Float height;

    public RightAngleTriangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public Float perimeter() {
        return (float)(Math.sqrt(Math.pow(this.base,2) + Math.pow(this.height, 2)) + this.base + this.height);
    }

    @Override
    public Float area() {
        return (this.base * this.height)/2;
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
        if (!super.equals(o)) return false;

        RightAngleTriangle that = (RightAngleTriangle) o;

        if (base != null ? !base.equals(that.base) : that.base != null) return false;
        return height != null ? height.equals(that.height) : that.height == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (base != null ? base.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}
