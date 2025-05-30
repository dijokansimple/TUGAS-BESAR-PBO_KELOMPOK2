



package javaswing_crud;

public class Buku extends ItemPerpustakaan {
    public Buku(int id, String nama, String author, String tahun, int jumlah, String status) {
        super(id, nama, author, tahun, jumlah, status);
    }
    
    public Buku() {
        super();
    }

    @Override
    public String getDetailInfo() {
        return "Buku: " + getNama() + " oleh " + getAuthor() + ", Tahun: " + getTahun() + ", Jumlah: " + getJumlah() + ", Status: " + getStatus();
    }
}
