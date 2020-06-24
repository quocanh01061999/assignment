package com.anhdq.action;

import com.anhdq.dao.AuthorDAO;

import com.anhdq.entity.AuthorEntity;
import com.opensymphony.xwork2.ActionSupport;

import javax.persistence.Column;
import java.util.List;

public class AuthorAction extends ActionSupport {

    private int MaTG;
    private String Tentacgia;
    private String Diachi;
    private String SDT;
    private String Email;

    public String execute() {
        AuthorDAO dao = new AuthorDAO();
        AuthorEntity entity = new AuthorEntity();
        entity.setMaTG(MaTG);
        entity.setTentacgia(Tentacgia);
        entity.setDiachi(Diachi);
        entity.setEmail(Email);
        entity.setSDT(SDT);
        dao.insertAuthor(entity);
        return "success";
    }

    public int getMaTG() {
        return MaTG;
    }

    public void setMaTG(int maTG) {
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
