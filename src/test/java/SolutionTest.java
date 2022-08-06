import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void multiplyExample1() {
    assertEquals("6", sol.multiply("2", "3"));
  }
  @Test
  void multiplyExample2() {
    assertEquals("56088", sol.multiply("123", "456"));
  }
}