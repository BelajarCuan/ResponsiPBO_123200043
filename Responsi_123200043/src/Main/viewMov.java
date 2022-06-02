
package Main;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author ASUS
 */

public class viewMov extends JFrame{
    JLabel lJudul = new JLabel("Judul Movie");
    JLabel lAlur = new JLabel("Alur Cerita");
    JLabel lPenokohan = new JLabel("Penokohan");
    JLabel lAkting = new JLabel("Akting");
    
    public JTextField tfJudul = new JTextField();
    public JButton btnTambah = new JButton("Tambah");
    public JTextField tfAlur = new JTextField();
    public JButton btnUpdate = new JButton("Update");
    public JTextField tfPenokohan = new JTextField();
    public JButton btnDelete = new JButton("Delete");
    public JTextField tfAkting=  new JTextField();
    public JButton btnClear = new JButton("Clear");
 
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Judul", "Nilai Alur ", "Nilai Penokohan", "Nilai Akting", "Nilai Rating"};

    public viewMov() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("PENILAIAN MOVIE 2020");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);
        add(scrollPane);
        scrollPane.setBounds(20, 20, 500, 350);
        add(lJudul);
        lJudul.setBounds(575, 20, 90, 20);
        add(tfJudul);
        tfJudul.setBounds(550, 40, 120, 20);
        add(lAlur);
        lAlur.setBounds(575, 60, 90, 20);
        add(tfAlur);
        tfAlur.setBounds(550, 80, 120, 20);
        add(lPenokohan);
        lPenokohan.setBounds(580, 100, 90, 20);
        add(tfPenokohan);
        tfPenokohan.setBounds(550, 120, 120, 20);
        add(lAkting);
        lAkting.setBounds(590, 140, 90, 20);
        add(tfAkting);
        tfAkting.setBounds(550, 160, 120, 20);
        add(btnTambah);
        btnTambah.setBounds(560, 210, 90, 20);
        add(btnUpdate);
        btnUpdate.setBounds(560, 240, 90, 20);
        add(btnDelete);
        btnDelete.setBounds(560, 270, 90, 20);
        add(btnClear);
        btnClear.setBounds(560, 310, 90, 20);
    }
    
    public String getJudul(){
        return tfJudul.getText();
    }
    
    public String getAlur(){
        return tfAlur.getText();
    }
    
    public String getPenokohan(){
        return tfPenokohan.getText();
    }
    
    public String getAkting(){
        return tfAkting.getText();
    }
}