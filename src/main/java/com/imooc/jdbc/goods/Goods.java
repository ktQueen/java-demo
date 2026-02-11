package com.imooc.jdbc.goods;

import java.util.Date;

public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private String desp;
    private Date create_time;

    public Goods() {
    }

    public Goods(Integer id, String name, Double price, String desp, Date create_time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desp = desp;
        this.create_time = create_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Goods [name=" + name +
                ",price=" + price +
                ",desp=" + desp +
                ",create_time=" + create_time + "]";
    }
}
