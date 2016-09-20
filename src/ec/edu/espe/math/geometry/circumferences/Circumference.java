package ec.edu.espe.math.geometry.circumferences;

import ec.edu.espe.math.geometry.Shape;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public abstract class Circumference extends Shape{

    protected Float radio;

    public Circumference(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circumference that = (Circumference) o;

        return radio != null ? radio.equals(that.radio) : that.radio == null;

    }

    @Override
    public int hashCode() {
        return radio != null ? radio.hashCode() : 0;
    }
}
