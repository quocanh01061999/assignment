package com.anhdq.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTG")
    private Integer MaTG;

    @Column(name = "Tentacgia")
    private String Tentacgia;

    @Column(name = "Diachi")
    private String Diachi;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "Email")
    private String Email;

    public Integer getMaTG() {
        return MaTG;
    }

    public void setMaTG(Integer maTG) {
        MaTG = maTG;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        Tentacgia = tentacgia;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
