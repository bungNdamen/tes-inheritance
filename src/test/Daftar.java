package test;

public class Daftar {

    protected String nama;

    protected int id;

    protected void setNama(String nama) {
        this.nama  = nama;
        nama = null;
    }

    protected void setId(String id) {
        this.id = Integer.parseInt(id);
        id = null;
    }

    protected String getNama() {
        return nama;
    }

    protected int getId() {
        return id;
    }

    protected void hapus() {
        nama = null;
    }

    protected void cetak(String a) {
        System.out.println(a);
    }
}
