import java.text.DecimalFormat;

public class zakatMal {
    public static void main(String[] args){
        int[] listPenghasilan = {3736101, 3736101, 3736101, 3736101,3736101,3736101,3736101,3736101,3736101,3736101,3736101,3736101};
        int[] listPengeluaran = {650000, 765000, 650000, 765000, 650000, 765000, 650000, 765000, 650000, 765000, 650000, 765000};
        int totalPenghasilan = 0;
        int totalPengeluaran = 0;

        for (int i = 0; i < listPenghasilan.length; i++){
            totalPenghasilan += listPenghasilan[i];
        }

        for (int i = 0; i < listPengeluaran.length; i++){
            totalPengeluaran += listPengeluaran[i];
        }

        int Surplus = totalPenghasilan - totalPengeluaran;
        DecimalFormat df = new DecimalFormat("#,###");
        double Nisab = 2590000 * 85;
        String kategori;
        double zakatMal;

        if (totalPenghasilan > Nisab){
            kategori = "Muzakki (KAYA)";
        }
        else{
            kategori = "Mustahik (MISKIN)";
        }
        
        if (totalPenghasilan > Nisab){
            zakatMal = totalPenghasilan * (2.5 / 100);
        }
        else{
            zakatMal = 0;
        }

        System.out.println("Total Penghasilan : Rp " + df.format(totalPenghasilan));
        System.out.println("Total Pengeluaran : Rp " + df.format(totalPengeluaran));
        System.out.println("Surplus : Rp " + df.format(Surplus));
        System.out.println("Nisab : Rp " + df.format(Nisab));
        System.out.println("Kategori : " + kategori);
        System.out.println("Zakat Mal : Rp " + df.format(zakatMal));
    }
}