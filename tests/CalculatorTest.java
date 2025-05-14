import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
 @Test
 public void testAdd() {
  assertEquals(3, Calculator.add(1, 2));
 }

 @Test
 public void testSubtract() {
  assertEquals(-1, Calculator.subtract(1, 2));
 }

 @Test
 public void testMultiply() {
  assertEquals(2, Calculator.multiply(1, 2));
 }

 @Test
 public void testDivide() {
  assertEquals(0, Calculator.divide(1, 2));
 }

 @Test
 public void testModulus() {
  assertEquals(1, Calculator.modulus(1, 2));
 }

 @Test
 public void testPower() {
  assertEquals(1, Calculator.power(1, 2));
 }

 @Test
 public void testSquare() {
  assertEquals(1, Calculator.square(1));
 }

 @Test
 public void testCube() {
  assertEquals(1, Calculator.cube(1));
 }

}
