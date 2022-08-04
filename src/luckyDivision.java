import java.util.Scanner;

public class luckyDivision {


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();
        if(input%4==0||input%7==0||input%44==0||input%47==0||input%74==0||input%77==0||input%444==0||input%447==0||input%477==0||input%777==0||input%774==0||input%744==0){
        System.out.println("YES");
        return;
        }
        System.out.println("NO");
    }

}
