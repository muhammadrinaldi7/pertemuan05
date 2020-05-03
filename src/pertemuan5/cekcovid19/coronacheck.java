package pertemuan5.cekcovid19;

import java.util.Scanner;
public class coronacheck {
    //int suhu;
    String nama,gjala,tinggal,alamat,suhu;
    Scanner text = new Scanner(System.in);

    void textname (){
        System.out.print("Masukkan Nama Anda = ");
        nama = text.nextLine();
        System.out.println("===============================");
    }
    void textalamat(){
        System.out.print("Masukkan Alamat Lengkap anda = ");
        alamat = text.nextLine();
        System.out.println("===============================");
    }
    void tempat(){
        System.out.println("Kota terdekat dengan anda : ");
        System.out.println("- Banjarmasin");
        System.out.println("- Banjarbaru");
        System.out.print("Kota = ");
        tinggal = text.nextLine();
        System.out.println("===============================");
    }
    void suhusekarang(){
        System.out.print("Suhu badan anda sekarang = ");
        suhu = text.nextLine();
        System.out.println("===============================");
        int sh = Integer.parseInt(suhu);
        if (sh>37){
            System.out.println("Suhu badan anda diatas normal(Kemungkinan demam)");
        }else {
            System.out.println("Suhu badan anda normal");
        }
        System.out.println("===============================");
    }
    void gejala(){
        System.out.println("Apakah anda merasa gejala dibawah ini akhir-akhir ini : ");
        System.out.println("- Sakit tenggorokan ");
        System.out.println("- Merasa Flu");
        System.out.println("- Merasa Batuk");
        System.out.println("- Sesak Nafas");
        System.out.print("Ketik (y/t) : ");
        gjala = text.nextLine();
        System.out.println("===============================");

        if (gjala.equalsIgnoreCase("y")){
            System.out.println("Anda kemungkinan besar terpapar corona virus\n");
                if (tinggal.equalsIgnoreCase("banjarbaru")){
                    System.out.println("Anda kami jemput menuju ke RSUD Ratu Zalecha Martapura untuk pemeriksaan lebih lanjut!\n");
                }else if (tinggal.equalsIgnoreCase("banjarmasin")){
                    System.out.println("Anda kami jemput menuju ke RSUD Ulin Banjarmasin untuk pemeriksaan lebih lanjut!\n");
                }
        }else{
            System.out.println("Anda baik-baik saja, jaga kesehatan anda dan tetap dirumah!");
        }
    }
}
