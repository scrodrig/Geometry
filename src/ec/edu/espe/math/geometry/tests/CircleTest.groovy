package ec.edu.espe.math.geometry.tests

import ec.edu.espe.math.geometry.shapes.circumferences.Circle
import org.junit.Test

/**
 * Created by SchubertDavidRodriguez on 9/20/16.
 */
class CircleTest extends GroovyTestCase {

    @Test
    void testPerimeter() {
        Circle circle = new Circle(5f);
        assertEquals(circle.perimeter(),(float) (Math.PI * 2 * 5));
    }

    @Test
    void testArea() {
        Circle circle = new Circle(5f);
        assertEquals(circle.area(),(float) (Math.pow(5,2) * Math.PI));
    }
}
