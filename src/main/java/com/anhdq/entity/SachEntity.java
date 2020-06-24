package com.anhdq.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sach")
public class SachEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSach")
    private Integer MaSach;

    @Column(name = "MaLoai")
    private Integer MaLoai;

    @Column(name = "TenSach")
    private String TenSach;

    @Column(name = "Tomtat")
    private String Tomtat;

    @Column(name = "MaTG")
    private Integer MaTG;

    @Column(name = "MaNXB")
    private Integer MaNXB;

    public Integer getMaSach() {
        return MaSach;
    }

    public void setMaSach(Integer maSach) {
        MaSach = maSach;
    }

    public Integer getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(Integer maLoai) {
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

    public Integer getMaTG() {
        return MaTG;
    }

    public void setMaTG(Integer maTG) {
        MaTG = maTG;
    }

    public Integer getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(Integer maNXB) {
        MaNXB = maNXB;
    }
}
