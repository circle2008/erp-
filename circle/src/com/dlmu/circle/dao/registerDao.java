package com.dlmu.circle.dao;

/**
 * Created by cf on 2016/11/10.
 */

import com.dlmu.circle.model.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cf
 */
public class registerDao {
    public int register(Connection con,company company) throws SQLException{

        String sql="INSERT INTO Company VALUES(null,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1, company.getCname());
        stmt.setString(2, company.getCdesc());
        stmt.setString(3, company.getCartificial());
        stmt.setString(4, company.getCpassword());
        stmt.setString(5, company.getCountry());
        stmt.setString(6, company.getProvince());
        stmt.setString(7, company.getCity());
        stmt.setString(8, company.getBlock());
        stmt.setString(9, company.getPostcode());
        return stmt.executeUpdate();

    }
    public company companyloginSearch(Connection con,company company) throws SQLException{
        company companyresult=null;
        String sql="select * from Company where Cname=? and Cartificial=? and Cpassword=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, company.getCname());
        pstmt.setString(2, company.getCartificial());
        pstmt.setString(3, company.getCpassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            companyresult=new company();
            companyresult.setCname(rs.getString("Cname"));
            companyresult.setCartificial(rs.getString("Cartificial"));
            companyresult.setCpassword(rs.getString("Cpassword"));
        }
        return companyresult;

    }
}
