//http://acm.hust.edu.cn/vjudge/problem/viewProblem.action?id=19993

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] edges = new int[4];
        for(int c = 0; c<4; c++) {
            edges[c] = input.nextInt();
        }
        System.out.println(combine(edges));
    }
    public static String combine(int[] edges) {
        String answer = "IMPOSSIBLE";
        int[] temp = new int[3];
        for(int a=0; a<2; a++) {
            temp[0] = edges[a];
            for(int b=a+1; b<3; b++) {
                temp[1] = edges[b];
                for(int c=b+1; c<4; c++) {
                    temp[2] = edges[c];
                    String response = evaluate(temp);
                    switch(response) {
                        case "TRIANGLE": return "TRIANGLE";
                        case "SEGMENT": answer = "SEGMENT";
                    }
                }
            }
        }
        return answer;
    }
    public static String evaluate(int[] temp) {
        if(temp[0]+temp[1]>temp[2] &&
                temp[0]+temp[2]>temp[1] &&
                temp[1]+temp[2]>temp[0]) {
            return "TRIANGLE";
        }
        if(temp[0]+temp[1]==temp[2] ||
                temp[0]+temp[2]==temp[1] ||
                temp[1]+temp[2]==temp[0]) {
            return "SEGMENT";
        }
        return "IMPOSSIBLE";
    }
}
