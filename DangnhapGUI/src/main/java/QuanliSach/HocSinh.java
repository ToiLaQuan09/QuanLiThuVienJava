/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanliSach;

/**
 *
 * @author Admin
 */
public class HocSinh {
    private String maSV;
    private String tenSV;
    private String ngaySinh;
    private String lop;
    private String khoa;
    private String maSachMuon;
    private String tenSachMuon;
    private String ngayMuon;
    private String soLuong;
    
    public HocSinh() {
    }

    public HocSinh(String maSV, String tenSV, String ngaySinh, String lop, String khoa, String maSachMuon, String tenSachMuon, String ngayMuon, String soLuong) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.khoa = khoa;
        this.maSachMuon = maSachMuon;
        this.tenSachMuon = tenSachMuon;
        this.ngayMuon = ngayMuon;
        this.soLuong = soLuong;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMaSachMuon() {
        return maSachMuon;
    }

    public void setMaSachMuon(String maSachMuon) {
        this.maSachMuon = maSachMuon;
    }

    public String getTenSachMuon() {
        return tenSachMuon;
    }

    public void setTenSachMuon(String tenSachMuon) {
        this.tenSachMuon = tenSachMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

}
