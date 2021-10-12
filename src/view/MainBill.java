package view;

import manager.BillManager;
import model.Bill;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class MainBill {
    public static void main(String[] args) {
//        Customer thao = new Customer("Do Minh Thao","Ha Nam", "T01");
//        Customer loc = new Customer("Nguyen Dinh Loc","Bac Ninh", "T02");
//
//        Bill billOfLoc = new Bill("B01", loc, 0, 100);

        //doc file ngay khi bat dau du an
        BillManager kieuAnh = new BillManager();
        List<Bill> billList = kieuAnh.readFile();
        kieuAnh.setBillList(billList);
//        Bill billOfLoc2 = new Bill("B02", loc, 100, 158);

//        kieuAnh.save(billOfLoc);
//        kieuAnh.save(billOfLoc2);


    }
}
