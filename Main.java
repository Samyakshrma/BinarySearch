import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int target = 20;
        int[] arr = {2,3,4,5,6,9,10,11,13,14,15,16,17,18,19,20};
        int c = Binary(arr,target);
        System.out.println(c);




        }

    public static int Binary(int[] arr ,int target) {
        int a = arr.length;
        int b = 0;
        while(a>=b){
            if (target == arr[(a+b)/2]) {
                return (a+b)/2;
            }
            else if (target > arr[(a+b)/2]){
                b = ((a+b)/2)+1;
            }
            else {
                a= ((a+b)/2)-1;
            }

        }
        System.out.println("Target not found");
        return 0;



    }



}












