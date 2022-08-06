public class Solution {
  public String multiply(String num1, String num2) {
    int lenNum1 = num1.length(), lenNum2 = num2.length();
    int fixLen = lenNum1 + lenNum2 - 1, carry = 0;
    int[] tempDigits = new int[fixLen];
    for (int digit = 0; digit < fixLen;digit++) {
      int sum = 0;
      for (int pos = lenNum1 - 1; pos >= 0; pos--) {
        // c_pos = lenNum1 - 1 - pos + lenNum2 - 1 - digit
        int c_pos = lenNum1 - 1 - pos + lenNum2 - 1 - digit;
        if (c_pos >= 0 && c_pos < lenNum2) {
          sum += (num1.charAt(pos) - '0') * (num2.charAt(c_pos) - '0');
        }
      }
      sum += carry;
      carry = sum/10;
      tempDigits[fixLen-1-digit] = sum % 10;
    }
    StringBuilder sb = new StringBuilder();
    if (carry > 0) {
      sb.append(String.valueOf(carry));
    }
    for (int pos = 0; pos < fixLen;pos++) {
      String s = String.valueOf(tempDigits[pos]);
      sb.append(s);
      if (pos == 0 && s.equals("0") && carry == 0) {
        break;
      }
    }
    return sb.toString();
  }
}
