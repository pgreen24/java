import java.util.Scanner;

public class lima {
    public static void main(String[]args){
        Scanner lm = new Scanner(System.in);
        System.out.println("input the array number");
        int n= lm.nextInt();
        int[] arr = new int[n];
        System.out.println("input the number");
        for(int i=0;i<n;i++){
            arr[i]=lm.nextInt();
        }
        System.out.println("the array list");
        for(int i =0; i<n;i++){
            System.out.println("arr["+ i + "]="+ arr[i]);
        }
    }
}