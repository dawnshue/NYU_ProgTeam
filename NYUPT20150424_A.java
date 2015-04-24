import java.util.*;
public class Main {
  private String ans;
  public static void main(String[] args) {
    //add all numbers to queue
    //pop top of queue and check end of current list
    Scanner s = new Scanner(System.in);
    int students = s.nextInt();
    System.out.println(this.longest(students));
    System.out.println(ans);
  }
  private int longest(int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int count = 1;
    int last = 1
    StringBuilder s = new StringBuilder("1");
    for(int i=2; i<=n; i++) {
      if((i-last)==1) {
        q.add(i)
      } else {
        s.append(" "+i);
        last = i;
        count++;
      }
      if(q.size()>0) {
        while(q.size()>0) {
          int temp = q.poll();
          if(Math.abs((temp-last))==1) {
            q2.add(temp);
          } else {
            s.append(" "+temp);
            last = temp;
            count++;
          }
        }
        while(q2.size()>0) {
          q.add(q2.poll());
        }
      }
    }
    return count;
  }
}
