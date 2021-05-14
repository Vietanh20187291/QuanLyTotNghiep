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
public class SVTC {

    private String MSSV;
    private String TenSV;
    private int NienKhoa;
    private String SDT;
    private int TCHT;
    private int TCCL;
    private float DiemTB;
    private boolean TotNghiep;


    /**
     *
     * @param MSSV
     * @param TenSV
     * @param NienKhoa
     * @param SDT
     * @param TCHT
     * @param TCCL
     * @param DiemTB
     * @param TotNghiep
     */
    public SVTC(String MSSV, String TenSV, int NienKhoa, String SDT, int TCHT, int TCCL, float DiemTB, boolean TotNghiep) {
        this.TotNghiep = false;
        this.MSSV = MSSV;
        this.TenSV = TenSV;
        this.NienKhoa = NienKhoa;
        this.SDT = SDT;
        this.TCHT = TCHT;
        if(TCHT >70){
        this.TCCL = 0;}
        else{
        this.TCCL = 70 - TCHT;
        }
        this.DiemTB = DiemTB;
        if (TCHT >= 70) {
            TotNghiep = true;

        }
    }

    public SVTC() {
        this.TotNghiep = false;
        if (TCHT >= 70) {
            TotNghiep = true;

        }
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public String getSDT() {
        return SDT;
    }

    public int getTCHT() {
        return TCHT;
    }

    public int getTCCL() {
        if(TCHT >70){
        this.TCCL = 0;}
        else{
        this.TCCL = 70 - TCHT;
        }
        return TCCL;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public boolean isTotNghiep() {
        this.TotNghiep = false;
        if (TCHT >= 70) {
            TotNghiep = true;
        }
        return TotNghiep;
    }

    public int getNienKhoa() {
        return NienKhoa;
    }

    public void setNienKhoa(int NienKhoa) {
        this.NienKhoa = NienKhoa;
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

    public void setTCHT(int TCHT) {
        this.TCHT = TCHT;
    }

    public void setTCCL(int TCCL) {
        this.TCCL = TCCL;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    public void setTotNghiep(boolean TotNghiep) {
        this.TotNghiep = TotNghiep;
    }

    @Override
    public String toString() {
        return "SVTC{" + "MSSV=" + MSSV + ", TenSV=" + TenSV + ", NienKhoa=" + NienKhoa + ", SDT=" + SDT + ", TCHT=" + TCHT + ", TCCL=" + TCCL + ", DiemTB=" + DiemTB + ", TotNghiep=" + TotNghiep + '}';
    }

}
