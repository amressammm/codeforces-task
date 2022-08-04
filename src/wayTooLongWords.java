import java.util.Scanner;

public class wayTooLongWords {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        String input;
        while(inputSize>-1){
            input= sc.nextLine();
            int size=input.length();

            if(size<=10)
                System.out.println(input);
            else{
                System.out.println((input.charAt(0))+Integer.toString(size-2)+input.charAt(size-1));

            }
            inputSize--;
        }
    }
}
