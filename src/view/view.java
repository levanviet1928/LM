package view;

import dao.DBConnection;
import model.Document;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class view {
    public static void main(String[] args) {
//        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "SELECT * FROM dbo.Document";
//        try {
//            PreparedStatement result = connection.prepareStatement(sql);
//            ResultSet resultSet = result.executeQuery();
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("docID"));
//                System.out.println(resultSet.getString("docName"));
//                System.out.println(resultSet.getString("author"));
//                System.out.println(resultSet.getInt("publishYear"));
//                System.out.println(resultSet.getInt("quantity"));
//            }
//        } catch (SQLException e) {
//            System.out.println("không có dữ liệu");
//            e.printStackTrace();
//        }
        view v = new view();
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("----------------- QUẢN LÝ THƯ VIỆN -----------------");
            System.out.println("1. Quản lý thông tin tài liệu");
            System.out.println("2. Quản lý bạn đọc và nhân viên");
            System.out.println("3. Quản lý thông tin mượn trả ");
            System.out.println("4. Quản lý phiếu mượn");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            n = Integer.parseInt(sc.nextLine());
        }while(!v.checkNumber(Integer.toString(n)));
    }

    private boolean checkNumber(String num){
        String regexM = "^[0-4]{1}$";
        if(num.matches(regexM)){
            return true;
        }
        System.out.println("bạn đã nhập sai. Mời chọn lại chức năng: ");
        return false;
    }
}
