/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.SVTCDAL;
import Entities.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableModel;

/**
 *
 * @author Vanh
 */
public class SVTCBLL {

    private SVTCBLL() {

    }

    public TableModel show(ArrayList<SVTC> arrayList) {

//        List<SVTC> list = SVTCDAL.show();
        String[] columnNames = {"STT", "MSSV", "Tên SV", "Niên Khóa", "SĐT", "Tín Chỉ Hoàn Thành", "Tín Chỉ Còn Lại", "Điểm TB", "Tốt Nghiệp"};
        Object[][] data = new Object[arrayList.size()][columnNames.length];
        int row = 0;
        for (SVTC c : arrayList) {
            data[row][0] = (row + 1);
            data[row][1] = c.getMSSV();
            data[row][2] = c.getTenSV();
            data[row][3] = c.getNienKhoa();
            data[row][4] = c.getSDT();
            data[row][5] = c.getTCHT();
            data[row][6] = c.getTCCL();
            data[row][7] = c.getDiemTB();
            data[row][8] = c.isTotNghiep();
            row++;
        }

        DefaultTableModel table = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return int.class;
                    case 4:
                        return String.class;
                    case 5:
                        return int.class;
                    case 6:
                        return int.class;
                    case 7:
                        return boolean.class;//tạo checkbox cho cột này
                    default:
                        return String.class;
                }
            }
        ;
        };
        
       return table;

    }

//    public static ComboBoxModel cbb_show() {
//
//        StringBuilder items = new StringBuilder();
//        for (SVTC c : SVTCDAL.show()) {
//            items.append(c.getMSSV());
//            items.append("#");
//        }
//        return new DefaultComboBoxModel(items.toString().split("#"));
//    }
//
//    public static Object[] showControlWithCombobox(String cbbValue) {
//        return SVTCDAL.showControlWithCombobox(cbbValue);
//    }
//
//    public static ComboBoxModel cbb_showNienKhoa() {
//
//        StringBuilder items = new StringBuilder();
//        for (int i = 0; i < SVTCDAL.show().size(); i++) {
//            items.append(SVTCDAL.show().get(i).getNienKhoa());
//            items.append("#");
//        }
//
//        return new DefaultComboBoxModel(items.toString().split("#"));
//    }
    public  boolean update(String MSSV, String TenSV, int NienKhoa, String SDT, int TCHT, int TCCL, float DiemTB, boolean TotNghiep) {
        return new SVTCDAL().update(MSSV, TenSV, NienKhoa, SDT, TCHT, TCCL, DiemTB, TotNghiep);
    }

    public static TableModel search(String text) throws SQLException {

        ArrayList<SVTC> list = SVTCDAL.search(text);

        String[] columnNames = {"STT", "MSSV", " Tên SV", "Niên Khóa", "SĐT", "Tín Chỉ Hoàn Thành", "Tín Chỉ Còn Lại", "Điểm TB", " Tốt Nghiệp"};

        Object[][] data = new Object[list.size()][columnNames.length];

        int i = 0;

        for (SVTC t : list) {
            data[i][0] = i + 1;
            data[i][1] = t.getMSSV();
            data[i][2] = t.getTenSV();
            data[i][3] = t.getNienKhoa();
            data[i][4] = t.getTCHT();
            data[i][5] = t.getTCCL();
            data[i][6] = t.getDiemTB();
            data[i][5] = t.isTotNghiep();
            i++;
        }
        // TableModel
        
        DefaultTableModel table = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return int.class;
                    case 4:
                        return String.class; 
                    case 5:
                        return int.class;
                    case 6:
                        return int.class;
                    case 7:
                        return float.class;
                                            case 8:
                        return boolean.class;
                    default:
                        return String.class;
                }
            }
        ;
        };
        
       return table;
//        return new DefaultTableModel(data, columnNames);
    }


}
