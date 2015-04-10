import java.util.*;
public class Main {
  public static void main(String[] args) { 
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int len = s.nextInt();
    int[] heights = new int[len+1];
    for(int i=0; i<len; i++) {
      heights[i] = s.nextInt();
    }
    heights[len] = heights[0];
    System.out.println(bestpair(heights, len));
  }
  private static String bestpair(int[] heights, int len) {
    int p1 = 2;
    int p2 = 1;
    
    int np1 = 0;
    int np2 = 1;
    int min = Math.abs(heights[np2++]-heights[np1++]);
    while(np2<=len) {
      if(Math.abs(heights[np2]-heights[np1])<min) {
        p1=np1+1;
        p2=np2+1;
      }
      np1++;
      np2++;
      System.out.println(min);
    }
    if(p2>len) {
      p2=1;
    }
    
    return new String(p1+" "+p2);
  }
}
