package test;

import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

public class Job extends Bio {
    
    protected String pekerjaan;
    
    protected void setPekerjaan(String a) {
        this.pekerjaan = a;
        a = null;
    }
    
    protected String getPekerjaan() {
        return pekerjaan;
    }
    
    protected void Input() {
        Job ob = new Job();
        super.id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String sid = valueOf(super.id);
        super.nama = JOptionPane.showInputDialog("Nama");
        super.umur = Integer.parseInt(JOptionPane.showInputDialog("Umur"));
        String sumur = valueOf(super.umur);
        super.jenis = JOptionPane.showInputDialog("Jenis Kelamin");
        this.pekerjaan = JOptionPane.showInputDialog("Pekerjaan");
        
        ob.setId(sid);
        ob.setNama(nama);
        ob.setUmur(sumur);
        ob.setJenis(jenis);
        ob.setPekerjaan(pekerjaan);
        
        ob.cetak("ID\t:" + ob.getId());
        ob.cetak("Nama\t:" + ob.getNama());
        ob.cetak("Umur\t:" + ob.getUmur());
        ob.cetak("Jenis Kelamin\t:" + ob.getJenis());
        ob.cetak("Pekerjaan\t:" + ob.getPekerjaan());
    }
    
    protected void hapus() {
        super.hapus();
        pekerjaan = null;
        
    }
    
}
