package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    // Thuộc tính: mảng chứa các DVD trong cửa hàng
    private ArrayList<DigitalVideoDisc> itemsInStore;

    // Constructor
    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("DVD đã được thêm vào Store: " + dvd.getTitle());
        } else {
            System.out.println("DVD không hợp lệ, không thể thêm!");
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("DVD đã được xóa khỏi Store: " + dvd.getTitle());
        } else {
            System.out.println("DVD không có trong Store, không thể xóa!");
        }
    }

}
