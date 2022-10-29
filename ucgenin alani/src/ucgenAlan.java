import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
      //  değişkenleri oluşturalım
        int a,b;
        double c;
        // kullanıcıdan verileri alalım

        Scanner input=new Scanner(System.in);
        System.out.print("1.kenarı giriniz=");
        a=input.nextInt();
        System.out.print("2.kenarı giriniz=");
        b=input.nextInt();
        System.out.print("3.kenarı giriniz=");
        c=input.nextInt();
        double u =(a+b+c)/2;
        double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("alan ="+alan);

    }

}
