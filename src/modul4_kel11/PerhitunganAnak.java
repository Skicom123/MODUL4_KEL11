package modul4_kel11;
import java.util.*;

public class PerhitunganAnak {
    
    static float opsi_anak(){
        Scanner inputUsia = new Scanner(System.in);
        System.out.println("Masukkan Usia Anak:");
        System.out.print("Tahun: ");
        float tahun = inputUsia.nextFloat();
        System.out.print("Bulan: ");
        float bulan = inputUsia.nextFloat();
        float hasil_anak = (float) (2*(tahun+(bulan*0.1))+8);
        System.out.println("BMI anak: " + hasil_anak);
        return hasil_anak;
    }
}
