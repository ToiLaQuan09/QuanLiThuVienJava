/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien.dangnhapgui;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class User {
    private String taiKhoan;
    private String matKhau;
    Scanner scanner = new Scanner(System.in);
    public User(){
        
    }
    
    public User(String taiKhoan, String matKhau){
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
}

