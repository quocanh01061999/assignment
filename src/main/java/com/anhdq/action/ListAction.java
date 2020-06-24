package com.anhdq.action;

import com.anhdq.dao.SachDAO;
import com.anhdq.entity.SachEntity;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAction extends ActionSupport {
    private List<SachEntity> sachs;

    public String execute() {
        SachDAO dao = new SachDAO();
        sachs = dao.getAllSach();
        if (sachs.size() > 0) {
            return "success";
        }else {
            return "bad";
        }

    }

    public List<SachEntity> getSachs() {
        return sachs;
    }

    public void setSachs(List<SachEntity> sachs) {
        this.sachs = sachs;
    }
}
