import java.util.Scanner;

public class presents {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            input[num-1] = i;
        }
      String output=Integer.toString(input[0]);
        for (int i=1;i<input.length;i++){
            output+=" "+Integer.toString(input[i]);
        }
        System.out.println(output);

    }
}
