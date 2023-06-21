import java.util.*;

public class Case {
    public static void fnCap(String s){
        System.out.println(s.toUpperCase());
        return;
    }

    public static void fnSmall(String s){
        System.out.println(s.toLowerCase());
        return;
    }
    public static void fnFirstCap(String s1) {
        char c[] = s1.toCharArray();
        boolean flag = true;
        for(int i=0;i<s1.length();i++){
            char ch = c[i];
            if(Character.isLetter(ch)){
                if(flag){
                    c[i]=Character.toUpperCase(ch);
                    flag=false;
                }
            }
            else{
                flag=true;
            }
        }
        System.out.println(c);
        return;
    }

    public static void fnFirstSmall(String s1) {
        char c[] = s1.toCharArray();
        boolean flag = true;
        for(int i=0;i<s1.length();i++){
            char ch = c[i];
            if(Character.isLetter(ch)){
                if(flag){
                    c[i]=Character.toLowerCase(ch);
                    flag = false;
                }
            }
            else{
                flag = true;
            }
        }
        System.out.println(c);
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        System.out.println("1. UPPERCASE\n2. lowercase\n3. Capitalize Each Word\n4. tOGGLE CASE");
        System.out.println("Enter the String: ");
        String s1 = new String();
        s1 = sc.nextLine();
        while(true){
            System.out.println("Enter Choice: ");
            int c = sc.nextInt();
            sc.nextLine();
            switch(c){
                case 1:
                fnCap(s1);
                break;
                case 2:
                fnSmall(s1);
                break;
                case 3:
                fnFirstCap(s1);
                break;
                case 4:
                fnFirstSmall(s1);
                break;
                default:
                System.out.println("Invalid");
            }
        }
        
    }
}
