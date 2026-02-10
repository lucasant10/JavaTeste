import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    }

    @Test
    public void testAddWithNegativeNumbers() {
        Math newMath = new Math(-5, -10);
        Assert.assertEquals(-15, newMath.add());
    }

    @Test
    public void testAddWithZero() {
        Math newMath = new Math(5, 0);
        Assert.assertEquals(5, newMath.add());
    }

    @Test 
    public void testSubWithNegativeNumbers(){
        Math newMath = new Math(-5,10);
        Assert.assertEquals(-15, newMath.sub());
    
    }
}