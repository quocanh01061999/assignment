package com.anhdq.action;

import com.anhdq.dao.AuthorDAO;
import com.anhdq.entity.AuthorEntity;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAuthorAction extends ActionSupport {


    private List<AuthorEntity> authors;

    public String execute() {
        AuthorDAO dao = new AuthorDAO();
        authors = dao.getAllAuthor();
        if (authors.size() > 0) {
            return "success";
        }else {
            return "bad";
        }

    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }
}
