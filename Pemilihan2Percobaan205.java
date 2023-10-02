import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukan Sudut 1: ");
        sudut1 = input05.nextFloat();
        System.out.println("Masukan Sudut 2: ");
        sudut2 = input05.nextFloat();
        System.out.println("Masukan Sudut 3: ");
        sudut3 = input05.nextFloat();
        totalSudut = sudut1+sudut2+sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga Siku-Siku");    
            else 
                System.out.println("Bukan Segitiga Siku-Siku");
            }
         else {
            System.out.println("Bukan Segitiga");
        }
    }
}
