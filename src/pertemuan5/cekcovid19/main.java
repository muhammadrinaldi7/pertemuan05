package pertemuan5.cekcovid19;

public class main {
    public static void main(String[]args){
        coronacheck pas = new coronacheck();
        System.out.println("===============================");
        System.out.println("Cek Kesehatan Kemungkinan PDP");
        System.out.println("===============================");
        pas.textname();
        pas.textalamat();
        pas.tempat();
        pas.suhusekarang();
        pas.gejala();
        System.out.println("=======================================");
        System.out.println("Nama : " + pas.nama);
        System.out.println("Suhu Badan : " + pas.suhu);
        System.out.println("Alamat : " + pas.alamat);
        System.out.println("Daerah : " + pas.tinggal);
        System.out.println("=======================================");
        System.out.println("Kementrian Kesehatan Republik Indonesia");
        System.out.println("=======================================");
    }
}
