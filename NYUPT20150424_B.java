//Basically asking to find the complement of the intersection of the two sets
//This is multiset in that duplicates are allowed
//Find all elements in S1+S2-intersect(S1,S2)
//Compute the intersection first using a datastructure like binary search tree

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
      int l2l = scan.nextInt();
      for(int p=0; p<l1l; p++) {
        l1.add(scan.nextInt());
      }
      for(int p=0; p<l2l; p++) {
        l2.add(scan.nextInt());
      }
     System.out.println(getLeast(l1, l2));
    }
  }
  private static int getLeast(List<Integer> l1, List<Integer> l2) {
    Collections.sort(l1);
    Collections.sort(l2);
    int count = 0;
    int i=0;
    int i2=0;
    while(i<l1.size()) {
System.out.println(i);
      int temp = l1.get(i);
      while(l2.get(i2)<temp && i2<l2.size()) {
        i2++;
        count++;
      }
      while( i<l1.size() && i2<l2.size() && l1.get(i)==l2.get(i2) && l1.get(i)==temp) {
        i++;
        i2++;
      }
      while(l1.get(i)==temp && i<l1.size()) {
          i++;
          count++;
      }
      while(l2.get(i2)==temp && i2<l2.size()) {
          i2++;
          count++;
      }
    }
    while(i2<l2.size()) {
      i2++;
      count++;
    }
    return count;
  }
}
