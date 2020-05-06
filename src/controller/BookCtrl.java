package controller;

import model.Book;
import model.Document;

import java.util.Scanner;

public class BookCtrl extends DocumentCtrl {
    private boolean checkID(String id) {
        String regex = "^DCMT_\\d{6}$";
        if (id.matches(regex)) {
            return true;
        }
        return false;
    }

    @Override
    public void show(Document p) {

    }


    @Override
    public Book addFromKeyBroad() {
        Document doc = super.addFromKeyBroad();
        Scanner sc = new Scanner(System.in);
        String bookID = "";
        System.out.println("Nhập mã sách:(ví dụ : DCMT_xxxxxx)");
        do {
            bookID = sc.nextLine();
        } while (!checkID(bookID));
        String bookType;
        String kinds[] = {"Khoa học", "Nghệ thuật", "Kinh tế", "Ẩm thực", "Công nghệ thông tin"};
        boolean isOK = false;
        int choice = 0;
        do {
            try {
                System.out.println("Nhập loại sách:");
                System.out.println("1. Khoa học");
                System.out.println("2. Nghệ thuật");
                System.out.println("3. Kinh tế");
                System.out.println("4. Ẩm thực");
                System.out.println("5. Công nghệ thông tin");
                choice = Integer.parseInt(sc.nextLine());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Nhập lại thể loại sách");
            }
        } while (!isOK);
        bookType = kinds[choice - 1];
        Book b = new Book(doc.getDocID(), doc.getDocumentName(), doc.getAuthor(), doc.getPublishYear(), doc.getQuantity()
                , bookID, bookType);
        return b;
    }
}
