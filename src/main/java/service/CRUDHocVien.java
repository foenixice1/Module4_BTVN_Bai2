package service;

import models.HocVien;

import java.util.ArrayList;

public class CRUDHocVien {
    public ArrayList<HocVien> list = new ArrayList<>();

    public CRUDHocVien() {
        list.add(new HocVien("Nam","1999","Thai Nguyen",0345634336,"nam@gmail.com","CNTT"));
        list.add(new HocVien("Hien","1999","Thai Nguyen",0345636663,"hien@gmail.com","ICTU"));
        list.add(new HocVien("Hung","1999","Thai Nguyen",0345636666,"hung@gmail.com","HANU"));
    }
    public void save(HocVien hocVien) {
        list.add(hocVien);
    }
    public void edit(HocVien hocVien, int index) {
        list.set(index,hocVien);
    }
    public void delete(int index){
        list.remove(index);
    }
}
