package manager;

import model.Bill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillManager implements GeneralManager<Bill> {
    private List<Bill> billList = new ArrayList<>();

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
        writeListBill();
    }

    @Override
    public List<Bill> findAll() {
        return billList;
    }

    @Override
    public void save(Bill bill) {
        billList.add(bill);
        writeListBill();
    }

    @Override
    public void delete(int index) {
        billList.remove(index);
        writeListBill();
    }

    //ghi file
    public void writeListBill(){
        File file = new File("filebill.txt");
        try {
            OutputStream inputStream = new FileOutputStream(file);
            ObjectOutputStream ois = new ObjectOutputStream(inputStream);
            //ghi de
            ois.writeObject(billList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //doc file
    public List<Bill> readFile() {
        List<Bill> billList = new ArrayList<>();

        // tao file khi chua co
        File file = new File("filebill.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//         kiem tra xem file co du lieu khong
        if (file.length()==0) return billList;
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Scanner s = new Scanner(System.in);
            billList = (List<Bill>)ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return billList;
    }

    public void showBill(){
        System.out.println(billList);
    }

}
