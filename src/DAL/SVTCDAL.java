/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.SVTC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Vanh
 */
public class SVTCDAL {



    public ArrayList<SVTC> show() {
        ArrayList<SVTC> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM SVTC");

            while (r.next()) {
                SVTC svtc = new SVTC();
                svtc.setMSSV(r.getString("MSSV"));
                svtc.setTenSV(r.getString("TenSV"));
                svtc.setSDT(r.getString("SDT"));
                svtc.setNienKhoa(r.getInt("NienKhoa"));
                svtc.setTCHT(r.getInt("TCHT"));
                svtc.setTCCL(svtc.getTCCL());
                svtc.setDiemTB(r.getFloat("DiemTB"));
                svtc.setTotNghiep(svtc.isTotNghiep());
                                list.add(svtc);
            }


        } catch (SQLException ex) {

            return null;
        }

        return list;
    }

    public boolean insert(SVTC t) {
        System.out.println("HIHI");
        try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("INSERT INTO SVTC VALUES (?, ?, ?, ?, ?, ?)");
            pre.setString(1, t.getMSSV());
            pre.setString(2, t.getTenSV());
            pre.setInt(3, t.getNienKhoa());            
            pre.setString(4, t.getSDT());
            pre.setInt(5, t.getTCHT());
            pre.setFloat(6, t.getDiemTB());


            pre.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(String MSSV) {
        try {
            System.out.println("delete1");
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("DELETE dbo.SVTC WHERE MSSV = ?");
            pre.setString(1, MSSV);
            return pre.executeUpdate() > 0;

        } catch (SQLException e) {
                        System.out.println("delete2");
            return false;
        }
    }

  
    public boolean update(String MSSV, String TenSV, int NienKhoa, String SDT, int TCHT, float DiemTB) {
        try {

            PreparedStatement pre = ConnectSQL.connect().prepareStatement("UPDATE dbo.SVTC SET TENSV=?, NienKhoa=?, SDT = ?, TCHT =?, DiemTB =? WHERE MSSV = ?;");

            pre.setString(1, TenSV);
            pre.setInt(2, NienKhoa);
            pre.setString(3, SDT);
            pre.setInt(4, TCHT);
            pre.setFloat(5, DiemTB);
            pre.setString(6, MSSV);

            return pre.executeUpdate() > 0;

        } catch (SQLException e) {
        return false;
        }

    }
        public static ArrayList<SVTC> search(String text) throws SQLException {

        Statement s = ConnectSQL.connect().createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM dbo.SVTC WHERE "
                + "MSSV LIKE '%" + text + "%' OR TenSV LIKE N'%" + text + "%' OR NienKhoa LIKE N'%");
        ArrayList<SVTC> list = new ArrayList<>();
        while (r.next()) {
            SVTC svtc = new SVTC();
            svtc.setMSSV(r.getString("MSSV"));
            svtc.setTenSV(r.getString("TenSV"));
            svtc.setNienKhoa(r.getInt("NienKhoa"));

        }
        return list;
    }
    
}
