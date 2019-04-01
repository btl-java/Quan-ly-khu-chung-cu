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
public class CanHo extends KhuCanHo{
    
    private String maCanHo;
    private String maCuDan;

    public CanHo(String maCanHo, float dienTich,long gia,boolean trangThai,int soPhong,String maCuDan,String maKhu) {
        this.dienTich = dienTich;
        this.gia = gia;
        this.trangThai = trangThai;
        this.soPhong = soPhong;
        this.maCanHo = maCanHo;
        this.maCuDan = maCuDan;
        this.maKhu = maKhu;
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
        return "CanHo{" + "maCanHo=" + maCanHo + ", dienTich=" + dienTich + ", gia=" + gia + ", trangThai=" + trangThai + ", soPhong=" + soPhong + ", maCuDan=" + maCuDan + ", maKhu=" + maKhu + '}';
    }

    public void setMaCuDan(String maCuDan) {
        this.maCuDan = maCuDan;
    }
}
