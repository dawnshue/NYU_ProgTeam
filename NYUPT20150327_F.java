//  http://acm.hust.edu.cn/vjudge/contest/view.action?cid=72675#problem/F
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int moments = scan.nextInt();
    int skip = scan.nextInt();
    int watched = 0;
    int curr = 1;
    for(int m=0;m<moments;m++) {
      int start = scan.nextInt();
      int end = scan.nextInt();
      while(curr+skip<=start) {
        curr=curr+skip;
      }
      watched = watched+end-curr+1;
      curr = end+1;
    }
    System.out.println(watched);
  }
}
