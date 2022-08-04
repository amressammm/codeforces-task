import java.util.Scanner;

public class chatRoom {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String word="hello";

        int j=0;
        for(int i=0;i<input.length();i++){
            char expect=word.charAt(j);
            if(input.charAt(i)==expect){
                j++;
                if(j>=word.length()) {
                    System.out.println("YES");
                    return;
                }

            }
        }
        System.out.println("NO");

    }
}
