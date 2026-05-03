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

  // You will need to get around vm limitations if you do use this method
  public boolean isEvenLUT(int number) {
    int[] even = new int[Integer.MAX_VALUE];
    boolean isEven = true;

    int increment = 0;
    for (int i = Integer.MAX_VALUE; i > -1; i--) {
      isEven = !isEven;
      if (isEven) {
        even[increment] = i;
        increment++;
      }
    }
    
    for (int num : even) {
      if (num == Math.abs(number)) {
        return true;
      }
    }
    return false;
  }

  // Credits to .patchwork. for giving python code, which I have turned to java code
  public boolean isEvenSwitch(int number) {
    switch (String.valueOf(number).charAt(String.valueOf(number).length() - 1)) {
      case '1':
      case '3':
      case '5':
      case '7':
      case '9':
        return false;
        break;
      default:
        return true;
    }
  }

  public boolean isEvenOrOdd(int number) {
    return true;
  }

  public boolean isEvenAndOdd(int number) {
    return false;
  }
}
