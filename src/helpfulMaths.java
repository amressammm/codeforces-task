
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class helpfulMaths {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String[] Temp = input.split(Pattern.quote("+"));
        int[] IntArray = new int[Temp.length];

        for (int i = 0; i < Temp.length; i++) {
            IntArray[i] = Integer.parseInt(Temp[i]);
        }
        Arrays.sort(IntArray);
        String output=Integer.toString(IntArray[0]);
        for(int i=1;i<IntArray.length;i++){
            output+="+"+ IntArray[i];

        }
        System.out.println(output);



    }
}
