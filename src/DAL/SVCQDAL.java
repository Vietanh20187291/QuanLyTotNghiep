/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DAL.SVCQDAL;
import java.sql.PreparedStatement;

/**
 *
 * @author Vanh
 */
public class SVCQDAL {

    ArrayList<SVCQ> list = new ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<SVCQ> show() {
        ArrayList<SVCQ> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r = s.executeQuery(" SELECT [MSSV], [TenSV], [NienKhoa] ,[SDT], [VatLi], [GiaiTich], [DaiSo], [CSDL], [OOP], [HDH],[Project1],Project2,Project3 ,[DoAn]\n"
                    + "   FROM [QLTotNghiep].[dbo].[SVCQ]");
            System.out.println("Show");
            while (r.next()) {
                SVCQ svcq = new SVCQ();
                svcq.setMSSV(r.getString("MSSV"));
                svcq.setTenSV(r.getString("TenSV"));
                svcq.setNienKhoa(r.getInt("NienKhoa"));
                svcq.setSDT(r.getString("SDT"));
                svcq.setVatLi(r.getFloat("VatLi"));
                svcq.setGiaiTich(r.getFloat("GiaiTich"));
                svcq.setDaiSo(r.getFloat("DaiSo"));
                svcq.setCSDL(r.getFloat("CSDL"));
                svcq.setOOP(r.getFloat("OOP"));
                svcq.setHDH(r.getFloat("HDH"));
                svcq.setProject1(r.getFloat("Project1"));
                svcq.setProject2(r.getFloat("Project2"));
                svcq.setProject3(r.getFloat("Project3"));
                svcq.setDoAn(r.getFloat("DoAn"));
                svcq.setDiemTB(svcq.getDiemTB());
                svcq.setTotNghiep(svcq.isTotNghiep());
                list.add(svcq);
                System.out.println("Add thanh cong");
            }

        } catch (SQLException ex) {
            System.out.println("Message = " + ex.getMessage());
            return null;
        }

        return list;
    }

    public static boolean insert(SVCQ c) {

        try {
            PreparedStatement pre;

            pre = ConnectSQL.connect().prepareStatement("INSERT [dbo].[SVCQ] ([MSSV], [TenSV], SDT,NienKhoa, [VatLi], [GiaiTich], [DaiSo], [CSDL], [OOP], [HDH],[Project1], [Project2], [Project3], [DoAn])"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pre.setString(1, c.getMSSV());
            pre.setString(2, c.getTenSV());
            pre.setString(3, c.getSDT());
            pre.setInt(4, c.getNienKhoa());
            pre.setFloat(5, c.getVatLi());
            pre.setFloat(6, c.getGiaiTich());
            pre.setFloat(7, c.getDaiSo());
            pre.setFloat(8, c.getCSDL());
            pre.setFloat(9, c.getOOP());
            pre.setFloat(10, c.getHDH());
            pre.setFloat(11, c.getProject1());
            pre.setFloat(12, c.getProject2());
            pre.setFloat(13, c.getProject3());
            pre.setFloat(14, c.getDoAn());
//                pre.setFloat(15, c.getDiemTB());
//                pre.setBoolean(16, c.isTotNghiep());

            pre.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.out.println("Message = " + e.getMessage());
            return false;
        }
    }

    public static boolean update(String MSSV, String TenSV, int NienKhoa, String SDT, Float VatLi, Float GiaiTich, Float DaiSo, Float CSDL, Float OOP, Float HDH, Float Project1, Float Project2, Float Project3, Float DoAn) {
        try {

            PreparedStatement pre = ConnectSQL.connect().prepareStatement("UPDATE dbo.SVCQ SET TenSV =?, NienKhoa=?,SDT=?, VatLi = ?, GiaiTich =?,DaiSo = ?, CSDL =?, OOP =?, HDH =?, Project1 =?,Project2 = ?, Project3 =?, DoAn =? WHERE MSSV = ?");
            pre.setString(1, TenSV);
            pre.setInt(2, NienKhoa);
            pre.setString(3, SDT);
            pre.setFloat(4, VatLi);
            pre.setFloat(5, GiaiTich);
            pre.setFloat(6, DaiSo);
            pre.setFloat(7, CSDL);
            pre.setFloat(8, OOP);
            pre.setFloat(9, HDH);
            pre.setFloat(10, Project1);
            pre.setFloat(11, Project2);
            pre.setFloat(12, Project3);
            pre.setFloat(13, DoAn);
            pre.setString(14, MSSV);
            return pre.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("e:"+e.getMessage());
                    return false;
        }

    }

    /**
     *
     * @param text
     * @return
     * @throws SQLException
     */
    public static ArrayList<SVCQ> search(String text) throws SQLException {

        Statement s = ConnectSQL.connect().createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM dbo.SVCQ WHERE "
                + "MSSV LIKE '%" + text + "%' OR TenSV LIKE N'%" + text + "%' OR NienKhoa LIKE N'%");
        ArrayList<SVCQ> list = new ArrayList<>();
        while (r.next()) {
            SVCQ svcq = new SVCQ();
            svcq.setMSSV(r.getString("MSSV"));
            svcq.setTenSV(r.getString("TenSV"));
            svcq.setNienKhoa(r.getInt("NienKhoa"));
            svcq.setVatLi(r.getFloat("VatLi"));
            svcq.setGiaiTich(r.getFloat("GiaiTich"));
            svcq.setProject2(r.getFloat("Project2 "));
            svcq.setCSDL(r.getFloat("CSDL"));
            svcq.setOOP(r.getFloat("OOP"));
            svcq.setProject3(r.getFloat("Project3"));
            svcq.setHDH(r.getFloat("HDH"));
            svcq.setProject1(r.getFloat("Project1"));
            svcq.setDoAn(r.getFloat("DoAn"));
            svcq.setDiemTB(r.getFloat("DiemTB"));
            svcq.setTotNghiep(r.getBoolean("TotNghiep"));

            list.add(svcq);
        }
        return list;
    }

    public static boolean delete(String MSSV) {
        try {

            PreparedStatement pre = ConnectSQL.connect().prepareStatement("DELETE dbo.SVCQ WHERE MSSV = ?");
            pre.setString(1, MSSV);
            return pre.executeUpdate() > 0;

        } catch (SQLException e) {
            return false;
        }
    }

}
