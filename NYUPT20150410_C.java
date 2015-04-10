import java.util.*;
public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    Scanner s = new Scanner(System.in);
    int chain = 0;
    while(s.hasNext()) {
      String line = s.next();
      String[] split = line.split(" ");
      split[0] = split[0].toLowerCase();
      split[2] = split[2].toLowerCase();
      if(map.containsKey(split[2])) {
        int value = map.get(split[2])+1;
        map.put(split[0],value);
        if(value>chain) {
          chain = value;
        }
      } else {
        map.put(split[0],2);
        map.put(split[2],1);
        if(2>chain) {
          chain = 2;
        }
      }
    }
    System.out.println(chain);
  }

}
