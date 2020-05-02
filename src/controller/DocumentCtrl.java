package controller;

import model.Document;

public class DocumentCtrl implements Ctr<Document> {
    private boolean checkID(String id){
        String regex = "^DOC_\\d{6}$";
        return true;
    }
    @Override
    public void show(Document p) {

    }

    @Override
    public Document addFromKeyBroad()
    {
        Document doc = new Document();
        // DOC_012345
        System.out.println("Nhập mã tài liệu:(ví dụ : DOC_xxxxxx)");
        String id="";

        return null;
    }
}
