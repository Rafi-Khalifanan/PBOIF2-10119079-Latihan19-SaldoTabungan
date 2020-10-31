package pboif2.pkg10119079.latihan19.saldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: membuat coding saldo tabungan
 *
 */
public class PBOIF210119079Latihan19SaldoTabungan {
    
    public static void main(String[] args) {
        double saldoAwal,bunga , saldoAkhir,sbunga ;
        int lama ;
        
        
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.print("Saldo Awal: Rp. ");
        saldoAwal = input.nextInt();
        System.out.print("Bunga/Bulan: ");
        bunga = input.nextInt();
        System.out.print("Lama (bulan): ");
        lama = input.nextInt();
        
        sbunga = bunga/100;
        for (int i = 1; i <= lama; i++){
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke- "+i+ "%s %n ",kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
                    
        }
           
    }
    
}
