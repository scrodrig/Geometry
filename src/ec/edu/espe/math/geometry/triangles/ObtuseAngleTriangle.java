package ec.edu.espe.math.geometry.triangles;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class ObtuseAngleTriangle extends RightAngleTriangle {

    public ObtuseAngleTriangle(Float base, Float height) {
        super(base, height);
    }

    @Override
    public Float perimeter() {
        return (this.getBase() + this.getHeight() + this.getSideOne());
    }

}
