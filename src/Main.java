import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c ;
        Scanner input = new Scanner(System.in);

        System.out.print(" a sayısını giriniz :");
        a = input.nextDouble();

        System.out.print("b sayısını giriniz :");
        b= input.nextDouble();

        System.out.print("c sayısını giriniz :");
        c= input.nextDouble();

        if((a>b) && (a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }

        }else if ((b>a) && (b>c)){
            if(c>a){
                System.out.println("b>c>a");
            }else{
                System.out.println("b>a>c");
            }

      }else if ((c>a) && (c>b)){
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }

    }
}
