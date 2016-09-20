package ec.edu.espe.math.geometry.shapes.circumferences;

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
public class Ellipse extends  Circumference {

    protected Float radioTwo;

    public Ellipse(Float radio, Float radioTwo) {
        super(radio);
        this.radioTwo = radioTwo;
    }

    @Override
    public Float perimeter() {
        return (float) (2 * Math.PI * Math.sqrt((Math.pow(this.radio,2) + Math.pow(this.radioTwo,2)) / 2));
    }

    @Override
    public Float area() {
        return (float) (Math.PI * this.radio * this.radioTwo);
    }

    public Float getRadioTwo() {
        return radioTwo;
    }

    public void setRadioTwo(Float radioTwo) {
        this.radioTwo = radioTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ellipse ellipse = (Ellipse) o;

        return radioTwo != null ? radioTwo.equals(ellipse.radioTwo) : ellipse.radioTwo == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (radioTwo != null ? radioTwo.hashCode() : 0);
        return result;
    }
}
