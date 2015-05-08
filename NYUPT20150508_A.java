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
        for(int x=0; x<list.size()-1; x++) {
            for(int y=x+1; y<list.size(); y++) {
                if(list.get(x)*list.get(y)<=input) {
                    count++;
                } else {
                    break;
                }
            }
        }
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
