import java.util.*;
public class PasswordGenerator {
  public static void main (String args[]) {
    int length = 20;
    char[] pos = new char[length];
    int[] rnnd = new int[length];
    Random rnd = new Random();
    String password = "";
    String password2;
    for (int i = 0; i < length; i++) { 
      rnnd[i] = rnd.nextInt(93) + 33;    
      pos[i] = (char) rnnd[i];
    }
    //System.out.println(Arrays.toString(pos));
    for (int i = 0; i < length; i++) {
      password2 = String.valueOf(pos[i]);
      password = password + password2;
    }
    System.out.println("Your randomly generated password is:");
    System.out.println(password);
  }
}
