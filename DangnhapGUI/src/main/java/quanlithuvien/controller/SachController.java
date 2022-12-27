/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlithuvien.controller;
import QuanliSach.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SachController extends Sach{
    private List<Sach> listSach;
    static String fileName = "D:\thiSinh.txt";
    private static File file = new File();
    
    public SachController(){
        this.listSach = new ArrayList<>();
    }
    
    public SachController(List<Sach> listSach){
        this.listSach = listSach;
    }
    public List<Sach> getListSach() {
        return listSach;
    }

    public void setListSach(List<Sach> listSach) {
        this.listSach = listSach;
    }
    
    public void initData(){
        Sach sach = new Sach();
        
    }
    public void themSach(Sach sach){
        listSach.add(sach);
    }
}
