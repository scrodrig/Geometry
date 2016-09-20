package ec.edu.espe.math.geometry.triangles;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class IsocescelesTriangle extends  RightAngleTriangle {


    public IsocescelesTriangle(Float base, Float height) {
        super(base, height);
    }

    @Override
    public Float perimeter() {
        return 2 * this.sideOne + this.getBase();
    }
}
