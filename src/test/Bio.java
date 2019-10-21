package test;

public class Bio extends Daftar {

    protected int umur;

    protected String jenis;

    protected void setUmur(String umur) {
        this.umur = Integer.parseInt(umur);
        umur = null;
    }

    protected void setJenis(String jenis) {
        this.jenis = jenis;
        jenis = null;
    }

    protected int getUmur() {
        return umur;
    }

    protected String getJenis() {
        return jenis;
    }

    protected void hapus() {
        jenis = null;
        super.hapus();
    }
}
