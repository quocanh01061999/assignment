package com.anhdq.action;

import com.anhdq.dao.SachDAO;
import com.anhdq.entity.SachEntity;
import com.opensymphony.xwork2.ActionSupport;

import javax.persistence.Column;

public class SachAction extends ActionSupport {
    private int MaSach;
    private int MaLoai;
    private String TenSach;
    private String Tomtat;
    private int MaTG;
    private int MaNXB;

    public String execute() {
        SachDAO dao = new SachDAO();
        SachEntity entity = new SachEntity();
        entity.setMaLoai(MaLoai);
        entity.setTenSach(TenSach);
        entity.setTomtat(Tomtat);
        entity.setMaTG(MaTG);
        entity.setMaNXB(MaNXB);
        dao.insertSach(entity);
        return "success";
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int maSach) {
        MaSach = maSach;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int maLoai) {
        MaLoai = maLoai;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTomtat() {
        return Tomtat;
    }

    public void setTomtat(String tomtat) {
        Tomtat = tomtat;
    }

    public int getMaTG() {
        return MaTG;
    }

    public void setMaTG(int maTG) {
        MaTG = maTG;
    }

    public int getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(int maNXB) {
        MaNXB = maNXB;
    }

}
