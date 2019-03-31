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
public class CanHo extends KhuCanHo {
    private String maCanHo;
    private String maCuDan;

    public CanHo(String maCanHo, float dienTich,long gia,boolean trangThai,int soPhong,String maCuDan,String maKhu) {
        super(dienTich, gia, trangThai, soPhong, maKhu);
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
}
