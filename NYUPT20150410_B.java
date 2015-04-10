import java.util.*;
public class Main {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
  Queue<Integer> q = new LinkedList<Integer>();
    while(s.hasNextInt()) {
      int key = s.nextInt();
      if(map.containsKey(key)) {
        map.put(key,map.get(key)+1);
      } else {
        map.put(key,1);
        q.add(key);
      }
    }
    for(Integer i : q) {
      System.out.println(i+" "+map.get(i));
    }
  }
}
