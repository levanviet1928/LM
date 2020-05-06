package controller;

import model.Document;

import java.util.Scanner;

public class DocumentCtrl implements Ctr<Document> {

    private boolean checkID(String id) {
        String regex = "^DOC_\\d{6}$";
        if (id.matches(regex)) {
            return true;
        }
        return false;
    }

    @Override
    public void show(Document p) {
        System.out.println(p);
    }

    @Override
    public Document addFromKeyBroad() {
        Scanner sc = new Scanner(System.in);

        // DOC_012345
        System.out.println("Nhập mã tài liệu:(ví dụ : DOC_xxxxxx)");
        String docId = "";
        do {
            docId = sc.nextLine();
        } while (!checkID(docId));
        System.out.println("Nhập tiêu đề: ");
        String docName = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        String author = sc.nextLine();
        boolean isOK = false;
        int amount = 0;
        int publishYear = 0;
        do {
            try {
                System.out.println("Nhập số lượng");
                amount = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập năm xuất bản");
                publishYear = Integer.parseInt(sc.nextLine());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Nhập sai số lượng hoặc năm xuất bản");
            }
        } while (!isOK);
        Document doc = new Document(docId, docName, author, publishYear, amount);
        return doc;
    }

}
