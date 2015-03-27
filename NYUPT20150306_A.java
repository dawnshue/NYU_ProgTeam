//http://acm.hust.edu.cn/vjudge/problem/viewProblem.action?id=111963
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        for(int c=0; c<8; c++) {
           score = score+evaluate(input.nextLine());
        }
        if(score>0) {
            System.out.println("Black");
        } else if(score<0) {
            System.out.println("White");
        } else {
            System.out.println("Draw");
        }
    }
    public static int evaluate(String line) {
        int total = 0;
        for(int i=0; i<line.length(); i++) {
            switch(line.charAt(i)) {
                case 'q': 
                    total=total+9;
                    break;
                case 'Q':
                    total = total-9;
                    break;
                case 'r':
                    total=total+5;
                    break;
                case 'R':
                    total=total-5;
                    break;
                case 'b':
                    total = total+3;
                    break;
                case 'B':
                    total=total-3;
                    break;
                case 'n':
                    total = total+3;
                    break;
                case 'N':
                    total=total-3;
                    break;
                case 'p':
                    total = total+1;
                    break;
                case 'P':
                    total=total-1;
                    break;
            }
        }
        return total;
    }
    
}
