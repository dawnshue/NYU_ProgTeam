import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        String[] strings = getPieces(n, input);
        if(strings != null) {
            System.out.println("YES");
            for(int i=0; i<strings.length; i++) {
                System.out.println(strings[i]);
            }
        } else {
            System.out.println("NO");
        }
    }
    public static String[] getPieces(int n, String input) {
        String[] strings = new String[n];
        int pos = 0;
        for(int i=0; i<n-1; i++) {
            int oldpos = pos;
            char a = input.charAt(pos++);
            if(pos>=input.length()) {
                    return null;
            }
            while(input.charAt(pos) == a) {
                pos++;
                if(pos>=input.length()) {
                    return null;
                }
            }
            strings[i] = input.substring(oldpos, pos);
        }
        if(pos>=input.length()) {
            return null;
        } else {
            strings[n-1] = input.substring(pos);
        }
        return strings;
    }
}
