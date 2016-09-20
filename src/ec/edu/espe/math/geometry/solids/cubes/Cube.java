package ec.edu.espe.math.geometry.solids.cubes;

import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Cube extends Square implements CubeSolidInterfaceInterface {

    public Cube(Float side) {
        super(side);
    }

    @Override
    public Float volume() {
        return (float) (Math.pow(this.side,3));
    }

}
