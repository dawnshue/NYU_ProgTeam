import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    int[] heights = new int[n];
    for(int c=0; c<n; c++) {
      int[c] = scanner.nextInt();
    }
    
    int perms = calculatePermutations(heights, d);
    System.out.println(perms);
  }
  
  private static int calculatePermutations(int[] heights, int d) {
    
  }
}
