package com.example.app1;

public class user {
    private int anh;
    private String ten, diaChi;
    private boolean gender;

    public user(int anh, String ten, String diaChi, boolean gender) {
        this.anh = anh;
        this.ten = ten;
        this.diaChi = diaChi;
        this.gender = gender;
    }

    public user(int anh, String ten) {
        this.anh = anh;
        this.ten = ten;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
