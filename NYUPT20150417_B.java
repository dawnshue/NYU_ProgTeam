import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.println(rank(input));
  }
  
  private static int rank(int input) {
    int places = 0;
    while((input-input%(Math.pow(10,places)))/(Math.pow(10,places)) >= 10) {
      places++;
    }
    for(int i = 0; i<places; i++) {
      
    }
    
  }
}
