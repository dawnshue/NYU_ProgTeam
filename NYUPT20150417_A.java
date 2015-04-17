import java.util.*;
public class Main {
  public static void main(String[] args) {
    String[] singles = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    String[] uniq = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String ans;
    if(n>=10 || n<=19) {
      ans = uniq[n-10];
    } else if(n<=9) {
      ans = singles[n];
    } else if(n%10==0) {
      ans = tens[n/10];
    } else {
      ans = tens[(n-n%10)/10]+singles[n%10];
    }
    System.out.println(english(n));
  }
  
  private static String english(int n) {
    
    return ans;
  }
}
