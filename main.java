import java.util.Scanner;
public class main {
    public static void main(String[] args){
        double tutar,kdvOran,kdvTutar,kdvliTurtar;
        System.out.print("lütfen tutarı Giriniz :");
        Scanner input=new Scanner(System.in);
        tutar=input.nextDouble();
        if(tutar>0 && tutar < 1000) {
            kdvOran = 0.18;
        }else {
            kdvOran = 0.08;
        }
        kdvTutar =tutar * kdvOran;
        kdvliTurtar=tutar + kdvTutar ;
        System.out.println("kdv'siz tutar :"+tutar);
        System.out.println("kdv Oranı :"+kdvOran);
        System.out.println("kdv tutarı :"+kdvTutar);
        System.out.println("kdv'li tutar :"+kdvliTurtar);



    }
}
