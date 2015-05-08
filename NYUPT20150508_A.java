import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        System.out.println(getSemiPrimes(input));
    }
    private static int getSemiPrimes(int input) {
        List<Integer> list = new LinkedList<Integer>();
        if(input>2) {
            list.add(2);
        }
        if(input>3) {
            list.add(3);
        }
        for(int i=5; i<=input/2; i=i+2) {
            if(isPrime(i)) {
                list.add(i);
            }
        }
        /*
        for(Integer t : list) {
            System.out.print(t+" ");
        }
        System.out.println();
        */
        int count=0;
        for(int x=1; x<=input; x++) {
            int x2 = x;
            int divisions = 0;
            int temp = 0;
            while(temp<list.size() && x2>=list.get(temp)) {
                if(x2%(list.get(temp))==0) {
                    x2 = x2/list.get(temp);
                    divisions++;
                }
                if(divisions>2) {
                    break;
                }
                temp++;
            }
            if(divisions==2) {
                //System.out.print(x+" ");
                count++;
            }
        }
        //System.out.println();
        return count;
    }
    private static boolean isPrime(int input) {
        for(int i=3; i<input; i++) {
            if(input%i == 0) {
                return false;
            }
        }
        return true;
    }
}
