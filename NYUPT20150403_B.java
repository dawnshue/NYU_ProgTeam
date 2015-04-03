import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    char[][] matrix = new char[n][m];
    for(int i=0; i<n; i++) {
      String line = scanner.next();
      for(int i2=0; i2<m; i2++) {
        matrix[i][i2] = line.charAt(i2);
      }
    }
    
    System.out.println(hasCycle(matrix));
    
  }
  private static String hasCycle(char[][] matrix) {
    
  }
}
