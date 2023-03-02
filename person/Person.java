package person;

import java.util.Scanner;

public abstract class Person {
    private String ma, ten, gioitinh, diachi;
    private String sdt;

    public Person() {

    }

    
    public Person(String ma, String ten, String sdt, String gioitinh, String diachi) {
        this.ten = ten;
        this.ma = ma;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    Scanner input = new Scanner(System.in);

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập mã: ");
        while (true) {
            ma = sc.nextLine();
            boolean check = setMa(ma);
            if (check) {
                break;
            }
        }

        System.out.print("nhập tên: ");
        while (true) {
            String ten = sc.nextLine();
            boolean check = setTen(ten);
            if (check) {
                break;
            }
        }

        System.out.print("nhập giới tính: ");
        gioitinh = sc.nextLine();

        System.out.print("nhập địa chỉ: ");
        diachi = sc.nextLine();

        System.out.print("nhập số điện thoại: ");
        while (true) {
            sdt = sc.nextLine();
            boolean check = setSdt(sdt);
            if (check)
                break;
        }
    }

    public String getMa() {
        return ma;
    }

    public boolean setMa(String ma) {

        if (ma != null && ma.length() == 5) {
            this.ma = ma;
            return true;
        } else {
            System.out.print("nhập lại mã: ");
            return false;
        }
    }

    public String getTen() {
        return ten;
    }

    public boolean setTen(String ten) {
        for (int i = 0; i < ten.length(); i++) {
            char ch = ten.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("Nhập lại tên: ");
                return false;
            }
        }
        this.ten = ten;
        return true;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        // String name;
        // System.out.println("Nhập giới tính:");
        // name = input.nextLine();
        // if (!name.matches("[a-zA-Z_]+")) {
        // System.out.println("Chỉ nhập chữ");
        // }
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public boolean setSdt(String sdt) {
        // if (!sdt.matches("[0-9]+")) {
        // System.out.println("nhập lại số điện thoai");
        // }

        if (sdt != null && sdt.length() == 10) {
            this.sdt = sdt;
            return true;
        } else {
            System.out.println("Nhập lại số điện thoại: ");
            return false;
        }
    }

    public abstract String toString();

}
