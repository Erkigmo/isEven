package isEven;

public class IsEvenFunctions {
  public boolean isEvenString(int number) {
    return Integer.toBinaryString(number).substring(Integer.toBinaryString(number).length() - 1, Integer.toBinaryString(number).length()).equalsIgnoreCase("0");
  }
  
  private boolean isEvenRecursion(int number) {
    if (number > 1) {
      return !isEvenRecursion(number - 1);
    } else if (number < 0) {
      return !isEvenRecursion(number + 1);
    } else {
      return number == 0;
    }
  }
  
  private boolean isEvenFor(int number) {
    boolean isEven = false;
    for (int i = Integer.MAX_VALUE; i > number; i--) {
      isEven = !isEven;
    }
    return isEven;
  }
}
