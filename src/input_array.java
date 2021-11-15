import java.util.InputMismatchException;
import java.util.Scanner;
public class input_array {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers of elements in the array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of the array");
        try{
            for(int i=0;i<size;i++)

                arr[i]=sc.nextInt();
                System.out.println("enter the index of element of the array");
                int index =sc.nextInt();
                System.out.println("array index element" + "="+ arr[index]);
                System.out.println("array element is accesed");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }



    }

}
