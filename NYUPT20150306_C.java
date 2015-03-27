//http://acm.hust.edu.cn/vjudge/problem/viewProblem.action?id=126638

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teams = 0;
        int exp = input.nextInt();
        int newbies = input.nextInt();
        while(2*newbies>exp && exp>0) {
            teams++;
            newbies=newbies-2;
            exp--;
        }
        if(2*newbies<=exp) {
            teams+=newbies;
        }
        System.out.println(teams);
    }
}
