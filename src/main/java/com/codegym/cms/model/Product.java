package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ten;
    private int gia;
    private int soluong;
    private String ngaytao;
    private String mota;

    @ManyToOne
    @JoinColumn(name = "sectors_id")
    private Sectors sectors;

    public Sectors getDepartment() {
        return sectors;
    }

    public void setDepartment(Sectors department) {
        this.sectors = sectors;
    }

    public Product() {
    }

    public Product(int gia, String mota, String ngaytao, int soluong, String ten,Sectors sectors) {
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.ngaytao = ngaytao;
        this.mota = mota;
        this.sectors = sectors;
    }

    public Product(Long id,int gia, String mota, String ngaytao, int soluong, String ten,Sectors sectors) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.ngaytao = ngaytao;
        this.mota = mota;
        this.sectors = sectors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Sectors getSectors() {
        return sectors;
    }

    public void setSectors(Sectors sectors) {
        this.sectors = sectors;
    }
}
