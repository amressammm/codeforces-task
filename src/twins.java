import java.util.Arrays;
import java.util.Scanner;

public class twins {

    public static void main(String[]args){
        Scanner z=new Scanner(System.in);
        int input =z.nextInt();
        int []array=new int[input];
        int total=0;
        for(int i=0;i<input;i++){
            array[i]=z.nextInt();
            total+=array[i];
        }
        total/=2;
        Arrays.sort(array);
        int output=1;
        int sum=0;
        for(int i=input-1;i>0;i--)
        {
            sum+=array[i];
            if(sum>total)
                break;
            else
                output++;
        }
        System.out.println(output);
    }
}

