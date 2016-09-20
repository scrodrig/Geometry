package ec.edu.espe.math.geometry.shapes.triangles;

import ec.edu.espe.math.geometry.shapes.ShapeInterface;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public abstract class Triangle implements ShapeInterface {

    protected Float sideOne;
    protected Float sideTwo;
    protected Float sideThree;

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public Float getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(Float sideTwo) {
        this.sideTwo = sideTwo;
    }

    public Float getSideThree() {
        return sideThree;
    }

    public void setSideThree(Float sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (sideOne != null ? !sideOne.equals(triangle.sideOne) : triangle.sideOne != null) return false;
        if (sideTwo != null ? !sideTwo.equals(triangle.sideTwo) : triangle.sideTwo != null) return false;
        return sideThree != null ? sideThree.equals(triangle.sideThree) : triangle.sideThree == null;

    }

    @Override
    public int hashCode() {
        int result = sideOne != null ? sideOne.hashCode() : 0;
        result = 31 * result + (sideTwo != null ? sideTwo.hashCode() : 0);
        result = 31 * result + (sideThree != null ? sideThree.hashCode() : 0);
        return result;
    }
}
