import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @SuppressWarnings("deprecation")
  @Test
  public void testaverageWithoutLowest(){
    double [] input1 = {2, 3, 4, 2};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
