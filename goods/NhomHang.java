package goods;

import java.io.Serializable;
import java.util.Scanner;
import ui.ScannerFactory;
import ui.Convertible;

public class NhomHang implements Serializable{
    private String maNhomHang;
    private String tenNhomHang;

    public NhomHang() {
    }

    public NhomHang(String maNhomHang, String tenNhomHang) {
        this.maNhomHang = maNhomHang;
        this.tenNhomHang = tenNhomHang;
    }

    // Scanner sc = ScannerFactory.getScanner();

    // public void input() {
        // System.out.print("Nhập mã nhóm hàng: ");
        // while (true) {
        //     String maNhomHangInPut = sc.nextLine();
        //     boolean check = setMaNhomHang(maNhomHangInPut);
        //     if (check) {
        //         break;
        //     }
        // }
        // System.out.print("Nhập tên nhóm hàng: ");
        // while (true) {
        //     String tenNhomHangInPut = sc.nextLine();
        //     boolean check = setTenNhomHang(tenNhomHangInPut);
        //     if (check) {
        //         break;
        //     }
        // }
    // }

    public String getMaNhomHang() {
        return maNhomHang;
    }

    public boolean setMaNhomHang(String maNhomHang) {
        if (maNhomHang != null && maNhomHang.length() == 8) {
            this.maNhomHang = maNhomHang;
            return true;
        } else {
            System.out.print("Nhập lại mã nhóm hàng: ");
            return false;
        }
    }

    public String getTenNhomHang() {
        return tenNhomHang;
    }

    public boolean setTenNhomHang(String tenNhomHang) {
        for (int i = 0; i < tenNhomHang.length(); i++) {
            char ch = tenNhomHang.charAt(i);
            if (!Character.isDigit(ch)) {
                System.out.print("Nhập lại tên nhóm hàng: ");
                return false;
            }
        }
        this.tenNhomHang = tenNhomHang;
        return true;
    }

    // @Override
    // public String toString() {
    //     return "Nhóm Hàng{" +
    //             "Mã nhóm hàng='" + maNhomHang + '\'' +
    //             ", tên nhóm hàng ='" + tenNhomHang + '\'' +
    //             '}';
    // }

}
