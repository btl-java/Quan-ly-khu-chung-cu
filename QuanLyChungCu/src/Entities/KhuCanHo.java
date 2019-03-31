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
public class KhuCanHo {
    
    protected String maKhu;
    protected String tenKhu;
    protected int soTang;
    protected int soCanTT;
    protected String diaChi;
    protected float dienTich;

    public KhuCanHo(String maKhu, String tenKhu, int soTang, int soCanTT, String diaChi) {
        this.maKhu = maKhu;
        this.tenKhu = tenKhu;
        this.soTang = soTang;
        this.soCanTT = soCanTT;
        this.diaChi = diaChi;
    }

    public KhuCanHo(float dienTich, long gia, boolean trangThai, int soPhong,String maKhu) {
        this.dienTich = dienTich;
        this.gia = gia;
        this.trangThai = trangThai;
        this.soPhong = soPhong;
        this.maKhu = maKhu;
    }


    @Override
    public String toString() {
        return "KhuCanHo{" + "maKhu=" + maKhu + ", tenKhu=" + tenKhu + ", soTang=" + soTang + ", soCanTT=" + soCanTT + ", diaChi=" + diaChi + '}';
    }
   
    protected long gia;
    protected boolean trangThai;
    protected int soPhong;

    public String getMaKhu() {
        return maKhu;
    }

    public void setMaKhu(String maKhu) {
        this.maKhu = maKhu;
    }

    public String getTenKhu() {
        return tenKhu;
    }

    public void setTenKhu(String tenKhu) {
        this.tenKhu = tenKhu;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoCanTT() {
        return soCanTT;
    }

    public void setSoCanTT(int soCanTT) {
        this.soCanTT = soCanTT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
        
}
