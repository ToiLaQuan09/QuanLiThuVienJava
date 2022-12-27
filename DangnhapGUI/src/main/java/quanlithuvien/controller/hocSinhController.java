/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlithuvien.controller;

import QuanliSach.VaoRa;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class hocSinhController {
    private List<VaoRa> listSinhVien;
    
    public hocSinhController(){
        this.listSinhVien = new ArrayList<>();
    }
    
    public hocSinhController(List<VaoRa> listSinhVien){
        this.listSinhVien = listSinhVien;
    }

    public List<VaoRa> getListSinhVien() {
        return listSinhVien;
    }

    public void setListSinhVien(List<VaoRa> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }
    
    public void addSinhVien(VaoRa sv){
        listSinhVien.add(sv);
    }
}
