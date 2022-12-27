/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanliSach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
public class File {
    
    public void luuFile(String fileName, Object obj) throws Exception{
        ObjectOutputStream oos;
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        }
        oos.close();
    }
    
    public Object docFile(String fileName) throws Exception{
        Object kq = null;
        ObjectInputStream ois;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            ois = new ObjectInputStream(fis);
            kq = ois.readObject();
        }
        ois.close();
        return kq;
    }
}
