
package Main;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author ASUS
 */

public class conMov {
    modMov modelMovie;
    viewMov viewMovie;
    public String data;
    public conMov(modMov modelMovie, viewMov viewMovie){
        this.modelMovie = modelMovie;
        this.viewMovie = viewMovie;
        
        if (modelMovie.getBanyakData()!=0) {
            String dataMovie[][] = modelMovie.readdata();
            viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
        
         viewMovie.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int baris = viewMovie.tabel.getSelectedRow();
                data = viewMovie.tabel.getValueAt(baris, 0).toString();
                String dataUpdate[] = new String[4];
                dataUpdate[0] = viewMovie.tabel.getValueAt(baris, 0).toString();
                dataUpdate[1] = viewMovie.tabel.getValueAt(baris, 1).toString();
                System.out.println(data);
            }
           });
         
         viewMovie.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double o,p,q;
                o=Double.parseDouble(viewMovie.tfAlur.getText());
                p=Double.parseDouble(viewMovie.tfPenokohan.getText());
                q=Double.parseDouble(viewMovie.tfAkting.getText());
                if(o<0||o>5||p<0||p>5||q<0||q>5){
                JOptionPane.showMessageDialog(null,"MAAF, Nilai Wajib(1-5)");
                }
                else {
                String Judul = viewMovie.getJudul();
                double Alur = Double.parseDouble(viewMovie.getAlur());
                double Penokohan = Double.parseDouble(viewMovie.getPenokohan());
                double Akting = Double.parseDouble(viewMovie.getAkting());
                double Nilai = (Alur+Penokohan+Akting)/3;
                modelMovie.insertData(Judul, Alur, Penokohan, Akting, Nilai);
         
                String dataMovie[][] = modelMovie.readdata();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
                }
            }
        });
         
          viewMovie.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double o,p,q;
                o=Double.parseDouble(viewMovie.tfAlur.getText());
                p=Double.parseDouble(viewMovie.tfPenokohan.getText());
                q=Double.parseDouble(viewMovie.tfAkting.getText());
                if(o<0||o>5||p<0||p>5||q<0||q>5){
                JOptionPane.showMessageDialog(null,"MAAF, Nilai Wajib(1-5)");
                }
                else {
                String Judul = viewMovie.getJudul();
                double Alur = Double.parseDouble(viewMovie.getAlur());
                double Penokohan = Double.parseDouble(viewMovie.getPenokohan());
                double Akting = Double.parseDouble(viewMovie.getAkting());
                double Nilai = (Alur+Penokohan+Akting)/3;
                modelMovie.insertData(Judul, Alur, Penokohan, Akting, Nilai);
         
                String dataMovie[][] = modelMovie.readdata();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
                }
            }
        });
         
         
          
          viewMovie.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                viewMovie.tfJudul.setText("");
                viewMovie.tfAlur.setText("");
                viewMovie.tfPenokohan.setText("");
                viewMovie.tfAkting.setText("");
            }
        });
                  
          viewMovie.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int input = JOptionPane.showConfirmDialog(null,
                "Apa anda ingin menghapus Judul " + data + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                modelMovie.deletedata(data);
                String dataMovie[][] = modelMovie.readdata();
                viewMovie.tabel.setModel((new JTable(dataMovie, viewMovie.namaKolom)).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }
                }
        });
         
    }
    
}
