package view;

import dao.DBConnection;
import model.Document;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class view {
    static Scanner sc = new Scanner(System.in);

//    private static int menu() {
//        int n;
//        do {
//
//            System.out.println("----------------- QUẢN LÝ THƯ VIỆN -----------------");
//            System.out.println("1. Quản lý thông tin tài liệu");
//            System.out.println("2. Quản lý bạn đọc và nhân viên");
//            System.out.println("3. Quản lý nhân viên");
//            System.out.println("4. Quản lý thông tin mượn trả ");
//            System.out.println("5. Quản lý phiếu mượn");
//            System.out.println("0. Thoát");
//            System.out.println("Mời bạn chọn chức năng: ");
//            String input;
//            do {
//                input = sc.nextLine();
//            } while (!isnumber(input));
//            n = Integer.parseInt(input);
//
//        } while (!checkNumber(n));
//        return n;
//    }

    public static void main(String[] args) {
//
        view v = new view();

        int choice;
        do {
//            choice = menu();
            System.out.println("----------------- QUẢN LÝ THƯ VIỆN -----------------");
            System.out.println("1. Quản lý thông tin tài liệu");
            System.out.println("2. Quản lý bạn đọc ");
            System.out.println("3. Quản lý nhân viên");
            System.out.println("4. Quản lý thông tin mượn trả ");
            System.out.println("5. Quản lý phiếu mượn");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    v.docFunction();
                    break;
                case 2:
                    v.readerFun();
                    break;
                case 3:
                    v.EmployeeFun();
                    break;
                case 4:
                    v.borrowFun();
                    break;
                case 5:
                    v.billFun();
                    break;
                case 0:
                    System.out.println("-------------------CẢM ƠN QUÝ KHÁCH-------------------");
                    System.exit(0);
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (choice != 0);

    }

    private int docFunction() {
        int n;
        do {
            System.out.println("----------------- QUẢN LÝ THÔNG TIN TÀI LIỆU -----------------");
            System.out.println("1. Nhập thêm sách mới");
            System.out.println("2. Sửa thông tin đầu sách theo mã");
            System.out.println("3. Xóa sách ");
            System.out.println("4. Tìm kiếm sách theo thông tin:");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Nhập thông tin sách");
                    break;
                case 2:
                    System.out.println("Sửa thông tin sách");
                    break;
                case 3:
                    System.out.println("Xóa sách");
                    break;
                case 4:
                    System.out.println("Tìm kiếm sách theo thông tin");
                    searchBookMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;

    }

    private int searchBookMenu() {
        int n;
        do {
            System.out.println("-----------------TÌM KIẾM SÁCH -----------------");
            System.out.println("1. Theo tên sách");
            System.out.println("2. Theo tên tác giả");
            System.out.println("3. Năm xuất bản ");
            System.out.println("4. Thể loại");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Bạn chọn chức năng 1");
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng 2");
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng 3");
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng 4");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int readerFun() {
        int n;
        do {
            System.out.println("----------------- QUẢN LÝ THÔNG TIN BẠN ĐỌC -----------------");
            System.out.println("1. Nhập thêm bạn đọc mới mới");
            System.out.println("2. Sửa thông tin bạn đọc");
            System.out.println("3. Xóa bạn đọc ");
            System.out.println("4. Tìm kiếm bạn đọc theo thông tin:");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Nhập mới bạn đọc");
                    break;
                case 2:
                    System.out.println("Sửa thông tin bạn đọc");
                    break;
                case 3:
                    System.out.println("Xóa bạn đọc");
                    break;
                case 4:
                    System.out.println("Tìm kiếm bạn đọc");
                    searchReader();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int searchReader() {
        int n;
        do {
            System.out.println("-----------------TÌM KIẾM BẠN ĐỌC -----------------");
            System.out.println("1. Theo tên bạn đọc");
            System.out.println("2. Theo mã bạn đọc");
            System.out.println("3. Theo loại bạn đọc ");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Tìm kiếm theo tên bạn đọc");
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo mã bạn đọc");
                    break;
                case 3:
                    System.out.println("Tìm theo loại bạn đọc");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;

    }

    private int EmployeeFun() {
        int n;
        do {

            System.out.println("----------------- QUẢN LÝ THÔNG TIN NHÂN VIÊN -----------------");
            System.out.println("1. Nhập thêm nhân viên mới");
            System.out.println("2. Sửa thông tin nhân viên");
            System.out.println("3. Xóa nhân viên ");
            System.out.println("4. Tìm kiếm nhân viên theo thông tin:");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Nhập mới nhân viên");
                    break;
                case 2:
                    System.out.println("Sửa thông tin nhân viên");
                    break;
                case 3:
                    System.out.println("Xóa nhân viên");
                    break;
                case 4:
                    System.out.println("Tìm kiếm nhân viên");
                    searchEmployee();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int searchEmployee() {
        int n;
        do {
            System.out.println("-----------------TÌM KIẾM BẠN ĐỌC -----------------");
            System.out.println("1. Theo tên nhân viên");
            System.out.println("2. Theo mã nhân viên");
            System.out.println("3. Theo loại nhân viên ");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Tìm kiếm theo tên nhân viên");
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo mã nhân viên");
                    break;
                case 3:
                    System.out.println("Tìm theo loại nhân viên");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;

    }

    private int borrowFun() {
        int n;
        do {
            System.out.println("----------------- QUẢN LÝ THÔNG TIN MƯỢN TRẢ-----------------");
            System.out.println("1. Tạo thông tin");
            System.out.println("2. Sắp xếp danh sách");
            System.out.println("3. Tìm kiếm theo tên bạn đọc:");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Tạo thông tin");
                    createInfo();
                    break;
                case 2:
                    System.out.println("Sắp xếp danh sách");
                    sortList();
                    break;
                case 3:
                    System.out.println("Tìm kiếm theo tên bạn đọc");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int createInfo() {
        int n;
        do {
            System.out.println("-----------------TẠO THÔNG TIN QUẢN LÝ MƯỢN TRẢ -----------------");
            System.out.println("1. Thêm thông tin");
            System.out.println("2. Sửa thông tin");
            System.out.println("3. Xóa thông tin ");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Thêm thông tin");
                    break;
                case 2:
                    System.out.println("Sửa thông tin");
                    break;
                case 3:
                    System.out.println("Xóa thông tin");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int sortList() {
        int n;
        do {
            System.out.println("-----------------SẮP XẾP DANH SÁCH-----------------");
            System.out.println("1. Theo tên bạn đọc");
            System.out.println("2. Theo số lượng đầu sách được mượn(Giảm dần)");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Sắp xếp theo tên bạn đọc");
                    break;
                case 2:
                    System.out.println("Theo đầu sách được mượn (giảm dần)");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int billFun() {
        int n;
        do {
            System.out.println("----------------- QUẢN LÝ THÔNG TIN PHIẾU MƯỢN -----------------");
            System.out.println("1. Xuất thông tin phiếu mượn  cho bạn đọc hiện thời");
            System.out.println("2. Xuất thông tin đầu sách mượn");
            System.out.println("3. Xuất thông tin bạn đọc mượn sách  ");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Xuất thông tin phiếu mượn");
                    break;
                case 2:
                    System.out.println("Xuất thông tin đầu sách mượn");
                    showBookBorrow();
                    break;
                case 3:
                    System.out.println("Xuất thông tin bạn đọc mượn sách");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int showBookBorrow() {
        int n;
        do {
            System.out.println("-----------------HIỂN THỊ SÁCH ĐƯỢC MƯỢN-----------------");
            System.out.println("1. Nhiều nhất");
            System.out.println("2. Ít nhất");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Thông tin sách được mượn nhiều nhất");
                    break;
                case 2:
                    System.out.println("Thông tin sách được mượn ít nhất");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private int showReaderBorrow() {
        int n;
        do {
            System.out.println("-----------------HIỂN THỊ BẠN ĐỌC MƯỢN SÁCH-----------------");
            System.out.println("1. Nhiều nhất");
            System.out.println("2. Ít nhất");
            System.out.println("0. Quay lại");
            System.out.println("Mời bạn chọn chức năng: ");
            String input;
            do {
                input = sc.nextLine();
            } while (!isnumber(input));
            n = Integer.parseInt(input);
            switch (n) {
                case 1:
                    System.out.println("Thông tin bạn đọc mượn nhiều sách nhất");
                    break;
                case 2:
                    System.out.println("Thông tin bạn đọc mượn ít nhất");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("sai chức năng. Mời nhập lại");
            }
        } while (n != 0);
        return n;
    }

    private static boolean isnumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Mời nhập lại đúng chức năng! ");
            return false;
        }

    }

}
