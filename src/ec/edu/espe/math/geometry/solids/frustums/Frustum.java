package ec.edu.espe.math.geometry.solids.frustums;

import ec.edu.espe.math.geometry.shapes.circumferences.Ellipse;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Frustum extends Ellipse implements FrustumSolidInterface {

    private Float height;

    public Frustum(Float radio, Float radioTwo, Float height) {
        super(radio, radioTwo);
        this.height = height;
    }

    @Override
    public Float volume() {
        return (float) (Math.PI * this.radio * this. height * (Math.pow(this.radio,2) + Math.pow(this.radioTwo, 2) + this.radio * this.radioTwo));
    }


}
