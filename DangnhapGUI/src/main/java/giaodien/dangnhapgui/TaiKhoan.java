/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien.dangnhapgui;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class TaiKhoan extends User{
    private ArrayList<User> dsUser;
    
    public TaiKhoan(){
        dsUser = new ArrayList<>();
    }

    public ArrayList<User> getDsUser() {
        return dsUser;
    }

    public void setDsUser(ArrayList<User> dsUser) {
        this.dsUser = dsUser;
    }
    
    public ArrayList<User> initData(){
        dsUser.add(new User("luuminhquan2002", "khongbiet"));
        dsUser.add(new User("lythanhlam2002", "khongbiet"));
        dsUser.add(new User("buixuandiep2002", "khongbiet"));
        return dsUser;
    }
    public int size(){
        return dsUser.size();
    }
    
}
