/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.DangNhapGUI;
import Entities.SVTC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import BLL.SVTCBLL;
import DAL.ConnectSQL;
import DAL.SVCQDAL;
import DAL.SVTCDAL;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Than
 */
public class QLSVTC extends javax.swing.JFrame {

    private ArrayList<SVTC> list;

    DefaultTableModel model;

    /**
     * Creates new form StudentView
     */
    public QLSVTC() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new SVTCDAL().show();
        model = (DefaultTableModel) jTable1.getModel();
        showResult(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelMSSV = new javax.swing.JLabel();
        jLabelTenSV = new javax.swing.JLabel();
        jLabelNienKhoa = new javax.swing.JLabel();
        jLabelSDT = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtTenSV = new javax.swing.JTextField();
        txtNienKhoa = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabelTCHT = new javax.swing.JLabel();
        txtTCHT = new javax.swing.JTextField();
        jLabelDiemTB = new javax.swing.JLabel();
        txtDiemTB = new javax.swing.JTextField();
        jButtonTHEM = new javax.swing.JButton();
        jButtonXOA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSUA = new javax.swing.JButton();
        jButtonDSTotnghiep = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TT Sinh Viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("QUẢN LÝ SINH VIÊN TÍN CHỈ");

        jLabelMSSV.setText("MSSV :");

        jLabelTenSV.setText("Tên Sinh Viên : ");

        jLabelNienKhoa.setText("Niên Khóa :");

        jLabelSDT.setText("SDT : ");

        jLabelTCHT.setText("TC Hoàn Thành: ");

        txtTCHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTCHTActionPerformed(evt);
            }
        });

        jLabelDiemTB.setText("Điểm TB : ");

        jButtonTHEM.setText("Thêm SV");
        jButtonTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTHEMActionPerformed(evt);
            }
        });

        jButtonXOA.setText("Xóa SV");
        jButtonXOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXOAActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MSSV", "Tên SV", "Khóa", "SĐT", "TCHT", "TCCL", "Điểm TB", "Tốt Nghiệp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jButtonSUA.setText("Sửa SV");
        jButtonSUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUAActionPerformed(evt);
            }
        });

        jButtonDSTotnghiep.setText("Danh Sách Tốt Nghiệp");
        jButtonDSTotnghiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDSTotnghiepActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButton1.setText("Đăng Xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Quản Lý SVTC : Nguyễn Bá Tùng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDSTotnghiep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMSSV)
                                            .addComponent(jLabelTenSV)
                                            .addComponent(jLabelNienKhoa)
                                            .addComponent(jLabelSDT)
                                            .addComponent(jLabelTCHT)
                                            .addComponent(jLabelDiemTB)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButtonTHEM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSUA)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(txtTenSV)
                                        .addComponent(txtNienKhoa)
                                        .addComponent(txtSDT)
                                        .addComponent(txtTCHT)
                                        .addComponent(txtDiemTB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonXOA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonReset)))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMSSV)
                            .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTenSV)
                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNienKhoa)
                            .addComponent(txtNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSDT)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTCHT)
                            .addComponent(txtTCHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDiemTB)
                            .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTHEM)
                            .addComponent(jButtonXOA)
                            .addComponent(jButtonSUA)
                            .addComponent(jButtonReset))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonDSTotnghiep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void showSVTC() {
        jTable1.setModel(model); // load data to table
//        model.setHorizontalAlignment( JLabel.CENTER );// Căn giữa dữ liệu bảng
//        tbKhu.setDefaultRenderer(Object.class, renderer);// chỉ căn giữa dữ liệu là String

//        cbbMaKhu.setModel(KhuCanHoBLL.cbb_show()); //load data to combobox
    }
    private void jButtonXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXOAActionPerformed
        // TODO add your handling code here:

        clearData(list);
        int i = jTable1.getSelectedRow();

        new SVTCDAL().delete((String) jTable1.getValueAt(i, 1));
        list = new SVTCDAL().show();
        model.setRowCount(0);
        jTable1.setModel(model);
        showResult(list);
        txtDiemTB.setText("");
        txtMSSV.setText("");
        txtNienKhoa.setText("");
        txtSDT.setText("");
        txtTCHT.setText("");
        txtTenSV.setText("");


    }//GEN-LAST:event_jButtonXOAActionPerformed

    private void jButtonTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTHEMActionPerformed
        clearData(list);
        SVTC s = new SVTC();
        s.setMSSV(txtMSSV.getText());
        s.setTenSV(txtTenSV.getText());
        s.setNienKhoa(Integer.parseInt(txtNienKhoa.getText()));
        s.setSDT(txtSDT.getText());
        s.setTCHT(Integer.parseInt(txtTCHT.getText()));
        s.setDiemTB(Float.parseFloat(txtDiemTB.getText()));

        new SVTCDAL().insert(s);
        list = new SVTCDAL().show();

        model.setRowCount(0);
        jTable1.setModel(model);
        showResult(list);
        txtDiemTB.setText("");
        txtMSSV.setText("");
        txtNienKhoa.setText("");
        txtSDT.setText("");
        txtTCHT.setText("");
        txtTenSV.setText("");

    }//GEN-LAST:event_jButtonTHEMActionPerformed

    private void txtTCHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTCHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTCHTActionPerformed

    private void jButtonSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUAActionPerformed
        // TODO add your handling code here:

        clearData(list);
        int i = jTable1.getSelectedRow();

        clearData(list);
        SVTC s = new SVTC();
        s.setMSSV(txtMSSV.getText());
        s.setTenSV(txtTenSV.getText());
        s.setNienKhoa(Integer.parseInt(txtNienKhoa.getText()));
        s.setSDT(txtSDT.getText());
        s.setTCHT(Integer.parseInt(txtTCHT.getText()));
        s.setDiemTB(Float.parseFloat(txtDiemTB.getText()));
        new SVTCDAL().update(s.getMSSV(), s.getTenSV(), s.getNienKhoa(), s.getSDT(), s.getTCHT(), s.getDiemTB());
        list = new SVTCDAL().show();
        model.setRowCount(0);
        jTable1.setModel(model);
        showResult(list);

    }//GEN-LAST:event_jButtonSUAActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        txtMSSV.setText((String) jTable1.getValueAt(i, 1));
        txtTenSV.setText((String) jTable1.getValueAt(i, 2));
        txtNienKhoa.setText((String) jTable1.getValueAt(i, 3).toString());
        txtSDT.setText((String) jTable1.getValueAt(i, 4));
        txtTCHT.setText((String) jTable1.getValueAt(i, 5).toString());
        txtDiemTB.setText((String) jTable1.getValueAt(i, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDSTotnghiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDSTotnghiepActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DangNhapGUI s = new DangNhapGUI();
        s.setVisible(true);
    }//GEN-LAST:event_jButtonDSTotnghiepActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        txtDiemTB.setText("");
        txtMSSV.setText("");
        txtNienKhoa.setText("");
        txtSDT.setText("");
        txtTCHT.setText("");
        txtTenSV.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DangNhapGUI s = new DangNhapGUI();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showResult(ArrayList<SVTC> list) {
//        SVTC s = getList().get(getList().size() - 1);
//         model.addRow(new Object[]{
//            i++, s.getMSSV(), s.getTenSV(), s.getNienKhoa(), s.getSDT(), s.getTCHT(), s.getTCCL(), s.getDiemTB(), s.isTotNghiep()
//        });  
        int i = 1;
        for (SVTC s : list) {
            model.addRow(new Object[]{
                i++, s.getMSSV(), s.getTenSV(), s.getNienKhoa(), s.getSDT(), s.getTCHT(), s.getTCCL(), s.getDiemTB(), s.isTotNghiep()
            });
        }

    }

    public void clearData(ArrayList<SVTC> list) {
        System.out.println("size1 = " + list.size());
        list.clear();
        System.out.println("size = " + list.size());
//            (int i = 0;i<list.size();i++){
//                jTable1.removeAll;
//            }
//            jTable1.setModel(model);

    }

    public void clearTable() {
        jTable1.setModel(new DefaultTableModel(null, new String[]{}));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLSVTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDSTotnghiep;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSUA;
    private javax.swing.JButton jButtonTHEM;
    private javax.swing.JButton jButtonXOA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDiemTB;
    private javax.swing.JLabel jLabelMSSV;
    private javax.swing.JLabel jLabelNienKhoa;
    private javax.swing.JLabel jLabelSDT;
    private javax.swing.JLabel jLabelTCHT;
    private javax.swing.JLabel jLabelTenSV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiemTB;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNienKhoa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTCHT;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}