class Solution {
  public String intToRoman(int num) {
    String intString = Integer.toString(num);
    String s = "";

    int numDigits = intString.length();

    for (int i = numDigits - 1; i >= 0; i--) {
      //Ones place
      if (i == numDigits - 1) {
        switch(intString.charAt(i) - '0') {
          case 1:
            s = s + "I";
            break;
          case 2:
            s = s + "II";
            break;
          case 3:
            s = s + "III";
            break;
          case 4:
            s = s + "IV";
            break;
          case 5:
            s = s + "V";
            break;
          case 6:
            s = s + "VI";
            break;
          case 7:
            s = s + "VII";
            break;
          case 8:
            s = s + "VIII";
            break;
          case 9:
            s = s + "IX";
            break;
        }
      } else if (i == numDigits - 2) {
        //Tens place
        switch(intString.charAt(i) - '0') {
          case 1:
            s = "X" + s;
            break;
          case 2:
            s = "XX" + s;
            break;
          case 3:
            s = "XXX" + s;
            break;
          case 4:
            s = "XL" + s;
            break;
          case 5:
            s = "L" + s;
            break;
          case 6:
            s = "LX" + s;
            break;
          case 7:
            s = "LXX" + s;
            break;
          case 8:
            s = "LXXX" + s;
            break;
          case 9:
            s = "XC" + s;
            break;
        }
      } else if (i == numDigits - 3) {
        //Hundreds place
        switch(intString.charAt(i) - '0') {
          case 1:
            s = "C" + s;
            break;
          case 2:
            s = "CC" + s;
            break;
          case 3:
            s = "CCC" + s;
            break;
          case 4:
            s = "CD" + s;
            break;
          case 5:
            s = "D" + s;
            break;
          case 6:
            s = "DC" + s;
            break;
          case 7:
            s = "DCC" + s;
            break;
          case 8:
            s = "DCCC" + s;
            break;
          case 9:
            s = "CM" + s;
            break;
        }
      } else if (i == numDigits - 4) {
        //Thousands place
        switch(intString.charAt(i) - '0') {
          case 1:
            s = "M" + s;
            break;
          case 2:
            s = "MM" + s;
            break;
          case 3:
            s = "MMM" + s;
            break;
        }
      }
    }

    return s;
  }
}
