/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_crud;

/**
 *
 * @author DIMAS
 */
public abstract class ItemPerpustakaan {
    private int id;
    private String nama;
    private String author;
    private String tahun;
    private int jumlah;
    private String status;

    public ItemPerpustakaan(int id, String nama, String author, String tahun, int jumlah, String status) {
        this.id = id;
        this.nama = nama;
        this.author = author;
        this.tahun = tahun;
        this.jumlah = jumlah;
        this.status = status;
    }
    
    public ItemPerpustakaan() {
        //
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract String getDetailInfo();
}
