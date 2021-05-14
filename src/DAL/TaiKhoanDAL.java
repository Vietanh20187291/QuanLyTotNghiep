/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TaiKhoanDAL {
    
    private TaiKhoanDAL(){
        
    }
    
    public static Connection connection=ConnectSQL.connect();
    
    public static ArrayList<TaiKhoan> show(boolean vaiTro){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT TenTaiKhoan,MatKhau FROM TAIKHOAN WHERE VaiTro='"+vaiTro+"'");
       
            while (r.next()){
                list.add(new TaiKhoan(r.getString("TenTaiKhoan"), r.getString("MatKhau")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static TaiKhoan dangNhap(String userName,String passWord) {
		int vaiTro;
		TaiKhoan tk=null;
		try {
                    String sql="select * from TAIKHOAN where TenTaiKhoan=? and MatKhau=?";			
                    PreparedStatement pre=connection.prepareStatement(sql);
                    pre.setString(1, userName);
                    pre.setString(2, passWord);
                    ResultSet result=pre.executeQuery();
                    if (result.next()) {
                            tk=new TaiKhoan();
                            tk.setTenTaiKhoan(result.getString("TenTaiKhoan"));
                            tk.setMatKhau(result.getString("MatKhau"));
                            tk.setVaiTro(result.getInt("VaiTro"));
                            vaiTro=result.getInt("VaiTro");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tk;
	}
    

    }

    

