import java.util.Scanner;

public class stringTask {

    public static Boolean isVowel(char c){
        c=Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
               return false;
        }
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String  input= sc.nextLine();
        String output="";
        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            if(!isVowel(c))
                output+="."+Character.toLowerCase(c);

        }
        System.out.println(output);
    }
}
