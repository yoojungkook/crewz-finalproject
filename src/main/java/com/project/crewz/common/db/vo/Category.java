package com.project.crewz.common.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Category {
    private Long no;
    private String name;
    private String photo;
    private Long total;

    @Override
    public String toString() {
        return "Category{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", total=" + total +
                '}';
    }
}
