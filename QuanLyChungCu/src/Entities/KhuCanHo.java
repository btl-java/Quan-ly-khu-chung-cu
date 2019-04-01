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

    public KhuCanHo() {
    }
    
    protected String maKhu;
    protected String tenKhu;
    protected int soTang;
    protected int soCanTT;
    protected  String diaChi;
    protected  float dienTich;

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
    protected  long gia;
    protected boolean trangThai;
    protected  int soPhong;

    public KhuCanHo(String maKhu, String tenKhu, int soTang, int soCanTT, String diaChi) {
        this.maKhu = maKhu;
        this.tenKhu = tenKhu;
        this.soTang = soTang;
        this.soCanTT = soCanTT;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhuCanHo{" + "maKhu=" + maKhu + ", tenKhu=" + tenKhu + ", soTang=" + soTang + ", soCanTT=" + soCanTT + ", diaChi=" + diaChi + '}';
    }

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
    
}
