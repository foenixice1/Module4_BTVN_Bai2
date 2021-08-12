package models;

public class HocVien {
    String name;
    String date;
    String address;
    int phone ;
    String gmail;
    String classRoom;

    public HocVien(String name, String date, String address, int phone, String gmail, String classRoom) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.gmail = gmail;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
