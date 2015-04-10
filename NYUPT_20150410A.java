import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int len = s.nextInt();
    int[] heights = new int[len];
    for(int i=0; i<len; i++) {
      heights[i] = s.nextInt();
    }
    System.out.println(bestpair(heights, len));
  }
  private static String bestpair(int[] heights, int len) {
    int p1 = 1;
    int p2 = 2;
    int min = Math.abs(heights[1]-heights[0]);
    
    int np1 = 1;
    int np2 = 2;
    while(np2<len) {
      if(Math.abs(heights[np2++]-heights[np1++])<min) {
        p1=np1;
        p2=np2;
      }
    }
    if(Math.abs(heights[0]-heights[len-1])<min) {
      p2=1;
      p1=len;
    }
    
    return new String(p1+" "+p2);
  }
}
