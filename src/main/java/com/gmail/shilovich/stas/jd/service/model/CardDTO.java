package com.gmail.shilovich.stas.jd.service.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CardDTO {
    @NotEmpty
    private String title;
    private String name;
    @Size(max = 20)
    private String phone;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
