package isEven;

public class IsEvenFunctions {
  public boolean isEvenString(int number) {
    return Integer.toBinaryString(number).substring(Integer.toBinaryString(number).length() - 1, Integer.toBinaryString(number).length()).equalsIgnoreCase("0");
  }
  
  public boolean isEvenRecursion(int number) {
    if (number > 1) {
      return !isEvenRecursion(number - 1);
    } else if (number < 0) {
      return !isEvenRecursion(number + 1);
    } else {
      return number == 0;
    }
  }
  
  public boolean isEvenFor(int number) {
    boolean isEven = false;
    for (int i = Integer.MAX_VALUE; i > number; i--) {
      isEven = !isEven;
    }
    return isEven;
  }

  public boolean isEvendDouble(int number) {
    return String.valueOf((double) number / 2).contains(".0");
  }

  public boolean isEvenLUT(int number) {
    int[] even = new int[Integer.MAX_VALUE];
    boolean isEven = true;

    int increment = 0;
    for (int i = Integer.MAX_VALUE; i > 0; i--) {
      isEven = !isEven;
      if (isEven) {
        increment++;
        even[increment] = i;
      }
    }
    
    for (int num : even) {
      if (Math.abs(num) == number) {
        return true;
      }
    }
    return false;
  }
}
