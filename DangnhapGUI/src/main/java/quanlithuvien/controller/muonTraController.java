/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlithuvien.controller;
import QuanliSach.HocSinh;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class muonTraController {
    List<HocSinh> qliHocSinh;
    
    public muonTraController(){
        this.qliHocSinh = new ArrayList<>();
    }
    
    public muonTraController(List<HocSinh> qliHocSinh){
        this.qliHocSinh = qliHocSinh;
    }

    public List<HocSinh> getQliHocSinh() {
        return qliHocSinh;
    }

    public void setQliHocSinh(List<HocSinh> qliHocSinh) {
        this.qliHocSinh = qliHocSinh;
    }
    
    public void addSinhVien(HocSinh hs){
        qliHocSinh.add(hs);
    }
}
