import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.println(rank(input));
  }
  
  private static int rank(int input) {
    int places = 0;
    while((input-input%(Math.pow(10,places)))/(Math.pow(10,places)) >= 10) {
      places++;
    }
    System.out.println(places);
     if(input%10==7) {
      ans=2;
    } else {
        ans = 1;
    }
    for(int i=places; i>0; i--) {
      if((input-input%Math.pow(10,i))/Math.pow(10,i)==7) {
        ans=ans*3;
      } else {
        ans=ans*2;
      }
    }
    
    return ans;
  }
}
