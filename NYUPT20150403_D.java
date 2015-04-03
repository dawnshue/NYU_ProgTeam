import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    for(int t=0; t<tests; t++) {
      int numbers = scanner.nextInt();
      //int[] prefixes = new int[numbers];
      String[] strprefixes = new String[numbers];
      for(int n=0; n<numbers; n++) {
        //prefixes[n] = scanner.nextInt();
        strprefixes[n] = Integer.toString(prefixes[n]);
      }
       System.out.println(isConsistent(prefixes, strprefixes));
    }
  }
  
  public static String isConsistent(int[] prefixes, String[] strprefixes) {
    for(int i=0; i<(prefixes.length-1); i++) {
      int curr = prefixes[i]*10;
      int len = strprefixes[i].length();
      for(int i2=i+1; i2<prefixes.length; i2++) {
        if(prefixes[i2]==prefixes[i] ||
          (prefixes[i2]>=curr && strprefixes[i2].substring(0,len).equals(strprefixes[i]))
        ) {
          return "NO";
        }
      }
    }
    return "YES";
  }

}
