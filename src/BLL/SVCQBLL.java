/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.SVCQDAL;
import Entities.SVCQ;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Vanh
 */
public class SVCQBLL {

    private SVCQBLL() {

    }

    public static TableModel show() {

        List<SVCQ> list = SVCQDAL.show();
        String[] columnNames = {"STT", "MSSV", "Tên SV", "Niên Khóa", "Vật Lí", "Giải Tích", "Cơ Sở Dữ Liệu", "OOP", "Hệ Điều Hành", "Project 1", "Project 2", "Project 3", "Đồ Án", "Điểm TB", "Tốt Nghiệp"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for (SVCQ c : list) {
            data[row][0] = (row + 1);
            data[row][1] = c.getMSSV();
            data[row][2] = c.getTenSV();
            data[row][3] = c.getNienKhoa();
            data[row][4] = c.getVatLi();
            data[row][5] = c.getGiaiTich();
            data[row][6] = c.getCSDL();
            data[row][7] = c.getOOP();
            data[row][8] = c.getHDH();
            data[row][9] = c.getProject1();
            data[row][6] = c.getProject2();
            data[row][7] = c.getProject3();
            data[row][7] = c.getDoAn();
            data[row][7] = c.getDiemTB();
            data[row][7] = c.isTotNghiep();
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
                        return Float.class; //tạo checkbox cho cột này
                    case 5:
                        return Float.class;
                    case 6:
                        return Float.class;
                    case 7:
                        return Float.class;
                    case 8:
                        return Float.class;
                    case 9:
                        return Float.class;
                    case 10:
                        return Float.class;
                    case 11:
                        return Float.class;
                    case 12:
                        return Float.class;
                    case 13:
                        return Boolean.class;
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
//        for (CanHo c : CanHoDAL.show()) {
//            items.append(c.getMaCanHo());
//            items.append("#");
//        }
//        return new DefaultComboBoxModel(items.toString().split("#"));
//    }
//
//    public static Object[] showControlWithCombobox(String cbbValue) {
//        return CanHoDAL.showControlWithCombobox(cbbValue);
//    }
//
//    public static ComboBoxModel cbb_showTenKhu() {
//
//        StringBuilder items = new StringBuilder();
//        for (int i = 0; i < KhuCanHoDAL.show().size(); i++) {
//            items.append(KhuCanHoDAL.show().get(i).getTenKhu());
//            items.append("#");
//        }
//
//        return new DefaultComboBoxModel(items.toString().split("#"));
//    }

    public static boolean update(String MSSV, Float VatLi, Float GiaiTich, Float DaiSo, Float CSDL, Float OOP, Float HDH, Float Project1, Float Project2, Float Project3, Float DoAn, Float DiemTB, boolean TotNghiep) {
        return SVCQDAL.update(MSSV, VatLi, GiaiTich, DaiSo, CSDL, OOP, HDH,  Project1, Project2, Project3, DoAn, DiemTB, TotNghiep);
    }

     public static TableModel search(String text) throws SQLException {

        ArrayList<SVCQ> list = SVCQDAL.search(text);

        String[] columnNames = {"STT", "MSSV", "Tên SV", "Niên Khóa", "Vật Lí", "Giải Tích", "Cơ Sở Dữ Liệu", "OOP", "Hệ Điều Hành", "Project 1", "Project 2", "Project 3", "Đồ Án", "Điểm TB", "Tốt Nghiệp"};

        Object[][] data = new Object[list.size()][columnNames.length];

        int i = 0;

        for (SVCQ c : list) {
            data[i][0] = i + 1;
            data[i][0] = (i + 1);
            data[i][1] = c.getMSSV();
            data[i][2] = c.getTenSV();
            data[i][3] = c.getNienKhoa();
            data[i][4] = c.getVatLi();
            data[i][5] = c.getGiaiTich();
            data[i][6] = c.getCSDL();
            data[i][7] = c.getOOP();
            data[i][8] = c.getHDH();
            data[i][9] = c.getProject1();
            data[i][6] = c.getProject2();
            data[i][7] = c.getProject3();
            data[i][7] = c.getDoAn();
            data[i][7] = c.getDiemTB();
            data[i][7] = c.isTotNghiep();
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
                        return Float.class; //tạo checkbox cho cột này
                    case 5:
                        return Float.class;
                    case 6:
                        return Float.class;
                    case 7:
                        return Float.class;
                    case 8:
                        return Float.class;
                    case 9:
                        return Float.class;
                    case 10:
                        return Float.class;
                    case 11:
                        return Float.class;
                    case 12:
                        return Float.class;
                    case 13:
                        return Boolean.class;
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
