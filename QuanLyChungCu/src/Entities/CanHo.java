/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author PhamDai
 */
public class CanHo{
    
    private float dienTich;
    private long gia;
    private boolean trangThai;
    private int soPhong;
    private String maCanHo;
    private String maCuDan;
    private String maKhu;

    public CanHo() {
    }

    public String getMaKhu() {
        return maKhu;
    }

    public void setMaKhu(String maKhu) {
        this.maKhu = maKhu;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public CanHo(String maCanHo, float dienTich,long gia,boolean trangThai,int soPhong,String maCuDan,String maKhu) {
        this.dienTich = dienTich;
        this.gia = gia;
        this.trangThai = trangThai;
        this.soPhong = soPhong;
        this.maCanHo = maCanHo;
        this.maCuDan = maCuDan;
    }
    
    public String getMaCanHo() {
        return maCanHo;
    }

    public void setMaCanHo(String maCanHo) {
        this.maCanHo = maCanHo;
    }

    public String getMaCuDan() {
        return maCuDan;
    }

    @Override
    public String toString() {
        return "CanHo{" + "maCanHo=" + maCanHo + ", maCuDan=" + maCuDan + "}" ;
    }

    public void setMaCuDan(String maCuDan) {
        this.maCuDan = maCuDan;
    }
    
    public CanHo(String maCanHo,float dienTich,long gia,int soPhong,String maKhu){
        this.maCanHo=maCanHo;
        this.dienTich=dienTich;
        this.gia=gia;
        this.soPhong=soPhong;
        this.maKhu=maKhu;
    }
}
