package Pratik4;
import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double mesafe,taksimetre,baslangicucreti = 10,endusukucret =20;
        System.out.print("Gittiğniz Mesafeyi Yazınız:");
        mesafe =inp.nextInt();

        taksimetre=mesafe*2.20;
        taksimetre+=baslangicucreti;


        boolean kosul1 = taksimetre>=20;
        taksimetre =kosul1? taksimetre:endusukucret;


        System.out.print("Taksimetre:"+taksimetre +"TL");




    }
}
