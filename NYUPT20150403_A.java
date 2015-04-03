import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    int[] heights = new int[n];
    for(int c=0; c<n; c++) {
      heights[c] = scanner.nextInt();
    }
    
    int perms = calculatePermutations(heights, d);
    System.out.println(perms);
  }
  
  private static int calculatePermutations(int[] heights, int d) {
    int perms = 0;
    
    for(int i=0; i<heights.length; i++) {
      for(int i2=0; i2<heights.length; i2++) {
        if(i!=i2 && (heights[i2]-heights[i])<=d && (heights[i2]-heights[i])>=-d) {
          perms++;
        }
      }
    }
    
    return perms;
  }
}
