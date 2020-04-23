package modul4_kel11;
import java.util.*;

public class ProgramBmi {
    public static void main(String[] args) {
        System.out.println("Kelompok 11");
        System.out.println("1. Pramudya Anggara Picauly / 21120119130061");
        System.out.println("2. Fajar Rahmana Rajab      / 21120119140126");
        System.out.println("============================================");


        while (true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nPROGRAM BODY MASS INDEX");
            System.out.println("Opsi:");
            System.out.println("1. Dewasa");
            System.out.println("2. Anak-anak");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int opsi = userInput.nextInt();

             if (opsi==1){
                 System.out.println("\nOpsi:");
                 System.out.println("1. BMI dalam Pon (Lbs)");
                 System.out.println("2. BMI in Kilogram (Kg)");
                 System.out.print("Pilih opsi: ");
                 int opsii = userInput.nextInt();

                 if (opsii==1){
                     System.out.println("\nBMI dalam Pon (Lbs)");
                     PerhitunganDewasa.opsi_lbs();
                 } else if (opsii==2){
                     System.out.println("\nBMI dalam Kilogram (Kg)");
                     PerhitunganDewasa.opsi_kg();
                 } else {
                     System.out.println("\nPilihan anda salah.");
                 }
             } else if (opsi==2){
                 System.out.println("BMI anak-anak");
                 PerhitunganAnak.opsi_anak();
             } else if (opsi==3){
                 System.out.println("Terimakasih telah menggunakan program kami.");
                 break;
             } else {
                 System.out.println("Pilihan anda salah. Coba lagi.");
            }
        }
    }
}
