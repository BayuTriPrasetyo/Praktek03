package praktek03;
public class SarungTanganAksi {
    public static void main(String[] args) {
        SarungTangan s = new SarungTangan();
        
        s.setMerk("oklay");
        s.setWarna("hitam");
        s.setHarga(2000);
        //Gak Bisa s.setJenisKaosKaki();
        
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        KaosKaki kk = new KaosKaki();
        kk.setMerk("Bilabong");
        kk.setWarna("Hitam");
        kk.setHarga(5000);
        kk.setJenisKaosKaki("Kaos Kaki Panjang");
        kk.cetakInfo();
        System.out.println("Jenis \t:"+kk.getJenisKaosKaki());
        kk.throttle();
            
        
    }
}
