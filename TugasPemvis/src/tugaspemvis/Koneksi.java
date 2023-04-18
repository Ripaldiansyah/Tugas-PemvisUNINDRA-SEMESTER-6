/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspemvis;
import java.sql.*;
/**
 *
 * @author ripal
 */
public class Koneksi {  
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex){
            System.out.println("Gagal koneksi"+ex);  
        }
        String url ="jdbc:mysql://localhost/emas";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        } catch (Exception ex){
            System.out.println("Gagal koneksi Database"+ex);
        }
        return koneksi;
    }
}
