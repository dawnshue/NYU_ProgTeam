import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tests = scan.nextInt();
    List<Integer> l1;
    List<Integer> l2;
    for(int test=0; test<tests; test++) {
      l1 = new ArrayList<Integer>();
      int l1l = scan.nextInt();
      l2 = new ArrayList<Integer>();
      int l2l = scan.nextIn();
      for(int p=0; p<l1l; p++) {
        l1.add(scan.nextInt());
      }
      for(int p=0; p<l2l; p++) {
        l2.add(scan.nextInt());
      }
      System.out.println(getLeast(l1, l2);
    }
  }
  private static int getLeast(List<Integer> l1, List<Integer> l2) {
    Collections.sort(l1);
    Collections.sort(l2);
  }
}
