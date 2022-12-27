/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanliSach;

/**
 *
 * @author Admin
 */
public class VaoRa {
    private String maSV;
    private String tenSV;
    private String lop;
    private String khoa;
    private String ngayVao;
    private String thoiGian;
    
    public VaoRa(){
        
    }
    
    public VaoRa(String maSV){
        this.maSV = maSV;
    }
    public VaoRa(String maSV, String tenSV, String lop, String khoa, String ngayVao, String thoiGian) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.khoa = khoa;
        this.ngayVao = ngayVao;
        this.thoiGian = thoiGian;
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

    public String getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(String ngayVao) {
        this.ngayVao = ngayVao;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    
    
}
