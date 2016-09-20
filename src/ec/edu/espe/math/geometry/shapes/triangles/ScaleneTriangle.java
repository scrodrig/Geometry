package ec.edu.espe.math.geometry.shapes.triangles;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class ScaleneTriangle extends  Triangle {


    @Override
    public Float perimeter() {
        return this.sideOne + this.sideTwo + this.sideThree;
    }

    @Override
    public Float area() {

        float s = this.perimeter()/2;

        return (float) (Math.sqrt((s - this.sideOne) + (s - this.sideTwo) + (s - this.sideThree)));
    }

}
