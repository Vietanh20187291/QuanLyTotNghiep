/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Vanh
 */
public class SVCQ {

    private String MSSV;
    private String TenSV;
    private String SDT;
    private int NienKhoa;
    private Float VatLi;
    private Float GiaiTich;
    private Float DaiSo;
    private Float Project2;
    private Float CSDL;
    private Float OOP;
    private Float Project3;
    private Float HDH;
    private Float Project1;
    private Float DoAn;

    private Float DiemTB;
    private boolean TotNghiep;

    public SVCQ() {
//        this.TotNghiep = false;
//        this.DiemTB = (Float) (VatLi + GiaiTich + DaiSo + Project2 + CSDL + OOP + Project3 + HDH + Project1 + DoAn) / 10;
//        if (DiemTB > 5 && VatLi >= 0 && GiaiTich >= 0 && DaiSo >= 0 && Project2 >= 0 && CSDL >= 0 && OOP >= 0 && Project3 >= 0 && HDH >= 0 && DoAn >= 0) {
//            TotNghiep = true;

        
    }

    public SVCQ(String MSSV, String TenSV, String SDT, Integer NienKhoa, Float VatLi, Float GiaiTich, Float DaiSo, Float CSDL, Float OOP, Float HDH, Float Project1, Float Project2, Float Project3, Float DoAn) {
        this.TotNghiep = false;
        this.MSSV = MSSV;
        this.TenSV = TenSV;
        this.NienKhoa = NienKhoa;
        this.SDT = SDT;
        this.VatLi = VatLi;
        this.GiaiTich = GiaiTich;
        this.DaiSo = DaiSo;
        this.Project2 = Project2;
        this.CSDL = CSDL;
        this.OOP = OOP;
        this.Project3 = Project3;
        this.HDH = HDH;
        this.Project1 = Project1;
        this.DoAn = DoAn;
        int c = 0;
        if (VatLi != null) {
            c++;
        }
        if (GiaiTich != null) {
            c++;
        }
        if (DaiSo != null) {
            c++;
        }
        if (Project2 != null) {
            c++;
        }
        if (CSDL != null) {
            c++;
        }
        if (OOP != null) {
            c++;
        }
        if (Project3 != null) {
            c++;
        }
        if (HDH != null) {
            c++;
        }
        if (Project1 != null) {
            c++;
        }
        if (DoAn != null) {
            c++;
        }
        this.DiemTB = (Float) (VatLi + GiaiTich + DaiSo + Project2 + CSDL + OOP + Project3 + HDH + Project1 + DoAn) / c;
        if (DiemTB > 5 && VatLi >= 0 && GiaiTich >= 0 && DaiSo >= 0 && Project2 >= 0 && CSDL >= 0 && OOP >= 0 && Project3 >= 0 && HDH >= 0 && DoAn >= 0) {
            TotNghiep = true;
        }
    }

    //function check null
//    public boolean checkNull(Object object){
//        if(object == null){
//            return true;
//        }
//        return false;
//    }
//    public int getCount(Float VatLi){
//        int count = 0;
//        if(VatLi != null){
//            count ++;
//        }
//        return count;
//    }
    public String getMSSV() {
        return MSSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public int getNienKhoa() {
        return NienKhoa;
    }

    public String getSDT() {
        return SDT;
    }

    public Float getVatLi() {
        return VatLi;
    }

    public Float getGiaiTich() {
        return GiaiTich;
    }

    public Float getDaiSo() {
        return DaiSo;
    }

    public Float getProject2() {
        return Project2;
    }

    public Float getCSDL() {
        return CSDL;
    }

    public Float getOOP() {
        return OOP;
    }

    public Float getProject3() {
        return Project3;
    }

    public Float getHDH() {
        return HDH;
    }

    public Float getProject1() {
        return Project1;
    }

    public Float getDoAn() {
        return DoAn;
    }

    public Float getDiemTB() {
        if (VatLi != null) {

        }
        this.DiemTB = (Float) (VatLi + GiaiTich + DaiSo + Project2 + CSDL + OOP + Project3 + HDH + Project1 + DoAn) / 10;
        return DiemTB;
    }

    public boolean isTotNghiep() {
        TotNghiep = false;
        if (DiemTB > 5 && VatLi >= 0 && GiaiTich >= 0 && DaiSo >= 0 && Project2 >= 0 && CSDL >= 0 && OOP >= 0 && Project3 >= 0 && HDH >= 0 && DoAn >= 0) {
            TotNghiep = true;
        }
        return TotNghiep;
    }

    public void setTotNghiep(boolean TotNghiep) {
        this.TotNghiep = TotNghiep;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setNienKhoa(int NienKhoa) {
        this.NienKhoa = NienKhoa;
    }

    public void setVatLi(Float VatLi) {
        this.VatLi = VatLi;
    }

    public void setGiaiTich(Float GiaiTich) {
        this.GiaiTich = GiaiTich;
    }

    public void setDaiSo(Float DaiSo) {
        this.DaiSo = DaiSo;
    }

    public void setProject2(Float Project2) {
        this.Project2 = Project2;
    }

    public void setCSDL(Float CSDL) {
        this.CSDL = CSDL;
    }

    public void setOOP(Float OOP) {
        this.OOP = OOP;
    }

    public void setProject3(Float Project3) {
        this.Project3 = Project3;
    }

    public void setHDH(Float HDH) {
        this.HDH = HDH;
    }

    public void setProject1(Float Project) {
        this.Project1 = Project;
    }

    public void setDoAn(Float DoAn) {
        this.DoAn = DoAn;
    }

    public void setDiemTB(Float DiemTB) {
        this.DiemTB = (Float) (VatLi + GiaiTich + DaiSo + Project2 + CSDL + OOP + Project3 + HDH + Project1 + DoAn) / 10;
    }

    @Override
    public String toString() {
        return "SVCQ{" + "MSSV=" + MSSV + ", TenSV=" + TenSV + ", SDT=" + SDT + ", VatLi=" + VatLi + ", GiaiTich=" + GiaiTich + ", DaiSo=" + DaiSo + ", Project2=" + Project2 + ", CSDL=" + CSDL + ", OOP=" + OOP + ", Project3=" + Project3 + ", HDH=" + HDH + ", Project1=" + Project1 + ", DoAn=" + DoAn + ", DiemTB=" + DiemTB + ", TotNghiep=" + TotNghiep + '}';
    }

}
