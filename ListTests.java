import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

class TheStringChecker implements StringChecker{
    @Override
    public boolean checkString(String s){
      return (s.contains("i"));
    }
  }
public class ListTests {
    @Test 
	public void testFilter() {
    ArrayList<String> input1 = new ArrayList<String>();
    input1.add("hello");
    input1.add("my");
    input1.add("is");
    input1.add("Becky");
    input1.add("ing");
    input1.add("sing");
    ArrayList<String> output = new ArrayList<String>();
    output.add("is");
    output.add("ing");
    output.add("sing");
    StringChecker one = new TheStringChecker();
    assertEquals(output,  ListExamples.filter(input1, one));
    ArrayList<String> sortedOutput = new ArrayList<String>();
	}
    @Test 
	public void testMerge() {
        ArrayList<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("b");
        input1.add("a");
        ArrayList<String> input2 = new ArrayList<String>();
        input2.add("c");
        input2.add("c");
        ArrayList<String> output = new ArrayList<String>();
        output.add("a");
        output.add("b");
        output.add("a");
        output.add("c");
        output.add("c");

        assertEquals(output, ListExamples.merge(input1, input2));
    }
}
