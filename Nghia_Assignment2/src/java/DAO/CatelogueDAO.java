package DAO;


import Controller.ConnectDB;
import Model.Catalogue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khang
 */
public class CatelogueDAO {
    public ArrayList<Catalogue> getListCategory() {
        Connection con = ConnectDB.getConnection();
        String sql = "SELECT * FROM LOAI_SP";
        ArrayList<Catalogue> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Catalogue category = new Catalogue();
                category.setMaloai(rs.getString("MaLoai"));
                category.setTenloai(rs.getString("TenLoai"));
                list.add(category);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
     CatelogueDAO dao = new CatelogueDAO();
        for (Catalogue ds : dao.getListCategory()) {
            System.out.println(ds.getMaloai()+"--"+ds.getTenloai());
        }
    }
}
