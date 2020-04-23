package modul4_kel11;
import java.util.*;

public class PerhitunganDewasa {
    static float opsi_lbs(){
        Scanner inputLbs = new Scanner(System.in);

        System.out.print("Masukkan berat badan anda (Lbs): ");
        float berat_lbs = inputLbs.nextFloat();
        System.out.println("Masukkan tinggi badan anda (cm): ");
        float tinggi_cm = inputLbs.nextFloat();
        float hasil_lbs = (float) (berat_lbs*0.45/((tinggi_cm*0.01)*(tinggi_cm*0.01)));
        System.out.println("\nBMI anda: " + hasil_lbs);

        if (hasil_lbs <= 18) {
            System.out.println("Anda kurang berat badan.");
        } else if (hasil_lbs <= 25){
            System.out.println("Anda memiliki berat badan ideal.");
        } else if (hasil_lbs <= 30){
            System.out.println("Anda memiliki berat bada berlebih.");
        } else if (hasil_lbs <= 40){
            System.out.println("Maaf, anda gemuk.");
        } else {
            System.out.println("ANDA KEGEMUKAN! SEGERALAH DIET SEHAT!");
        }
        return hasil_lbs;
    }

    static float opsi_kg(){
        Scanner inputKg = new Scanner(System.in);

        System.out.print("Masukkan berat badan anda (Kg): ");
        float berat_kg = inputKg.nextFloat();
        System.out.print("Masukkan tinggi badan anda (cm): ");
        float tinggi_cm = inputKg.nextFloat();
        float hasil_kg = (float) (berat_kg / ((tinggi_cm*0.01)*(tinggi_cm*0.01)));
        System.out.println("\nBMI anda: " + hasil_kg);

        if (hasil_kg <= 18) {
            System.out.println("Anda kurang berat badan.");
        } else if (hasil_kg <= 25){
            System.out.println("Anda memiliki berat badan ideal.");
        } else if (hasil_kg <= 30){
            System.out.println("Anda memiliki berat bada berlebih.");
        } else if (hasil_kg <= 40){
            System.out.println("Maaf, anda gemuk.");
        } else {
            System.out.println("ANDA KEGEMUKAN! SEGERALAH DIET SEHAT!");
        }
        return hasil_kg;
    }
}
