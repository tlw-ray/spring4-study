package com.tlw.spring.practice.ch04_mvc;

/**
 * Created by 唐力伟 on 2017/4/9 21:12.
 */
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj() {
        super();
    }

    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
