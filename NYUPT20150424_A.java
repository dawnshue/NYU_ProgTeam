import java.util.*;
public class Main {
  public static void main(String[] args) {
    //add all numbers to queue
    //pop top of queue and check end of current list
    Scanner s = new Scanner(System.in);
    int students = s.nextInt();
    System.out.println(longest(students));
  }
  private int longest(int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int count = 1;
    int last = 1
    StringBuilder s = new StringBuilder("1");
    for(int i=2; i<=n; i++) {
      if(q.size()>0) {
        
      }
    }
  }
}
