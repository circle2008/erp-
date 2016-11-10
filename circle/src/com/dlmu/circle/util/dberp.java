package com.dlmu.circle.util;

/**
 * Created by cf on 2016/11/10.
 */
public class dberp {
    private String driver = "com.mysql.jdbc.Driver";
    // URL指向要访问的数据库名world
    private String url = "jdbc:mysql://localhost:3306/db_erp?characterEncoding=UTF-8";
    // MySQL配置时的用户名
    private String user = "root";
    // MySQL配置时的密码
    private String password = "";
    public Connection getCon()throws Exception{
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);

        return conn;
    }
    public void closeCon(Connection conn)throws Exception{
        if(conn!=null)
            conn.close();
    }
    public static void main(String[] args) {
        dberp con=new dberp();
        try {
            con.getCon();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
