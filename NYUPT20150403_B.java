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
    
    System.out.println(evaluate(n, m, matrix));
    
  }
  private static String evaluate(int n, int m, char[][] matrix) {
    for(int i=0; i<n-1; i++) {
      for(int i2=0; i2<m-1; i2++) {
        if(hasCycle(matrix,i,i2)) return "Yes";
      }
    }
    return "No";
  }
}
