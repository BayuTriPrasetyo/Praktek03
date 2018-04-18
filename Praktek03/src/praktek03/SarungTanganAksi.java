package praktek03;
public class SarungTanganAksi {
    public static void main(String[] args) {
        SarungTangan s = new SarungTangan();
        
        s.setMerk("oklay");
        s.setWarna("hitam");
        s.setHarga(2000);
        
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
    }
}
