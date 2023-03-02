package goods;

import java.io.Serializable;
import java.util.Scanner;

import ui.Convertible;

public class HangHoa implements Serializable {
    private String maHang;
    private String maNhomHang;
    private String tenHang;
    private String donViTinh;
    private double donGia;
    private double VAT = 0.8;

    public HangHoa() {
    }

    public HangHoa(String maHang, String maNhomHang, String tenHang, String donViTinh, double donGia, double vAT) {
        this.maHang = maHang;
        this.maNhomHang = maNhomHang;
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        VAT = vAT;
    }

    // Scanner sc = ScannerFactory.getScanner();
    NhomHang nh = new NhomHang();

    // public void input() {
    //     System.out.print("Nhập mã nhóm hàng: ");
    //     while (true) {
    //         String maNhomHangInPut = sc.nextLine();
    //         boolean check = nh.setMaNhomHang(maNhomHangInPut);
    //         if (check) {
    //             break;
    //         }
    //     }

    //     System.out.print("Nhập mã hàng: ");
    //     while (true) {
    //         String maHangInPut = sc.nextLine();
    //         boolean check = setMaHang(maHangInPut);
    //         if (check) {
    //             break;
    //         }
    //     }

    //     System.out.print("Nhập tên hàng: ");
    //     while (true) {
    //         String tenHangInPut = sc.nextLine();
    //         boolean check = setTenHang(tenHangInPut);
    //         if (check) {
    //             break;
    //         }
    //     }

    //     System.out.print("Nhập đơn vị tính: ");
    //     while (true) {
    //         String dvtInPut = sc.nextLine();
    //         boolean check = setDonViTinh(dvtInPut);
    //         if (check) {
    //             break;
    //         }
    //     }

    //     System.out.print("Nhập đơn giá: ");
    //     while (true) {
    //         String donGiaInPut = sc.nextLine();
    //         boolean check = setDonGia(donGiaInPut);
    //         if (check) {
    //             break;
    //         }
    //     }
    // }

    public String getMaHang() {
        return maHang;
    }

    public boolean setMaHang(String maHang) {
        if (maHang != null && maHang.length() == 8) {
            this.maHang = maHang;
            return true;
        } else {
            System.out.println("Nhập lại mã hàng: ");
            return false;
        }
    }

    public String getMaNhomHang() {
        return maNhomHang;
    }

    public void setMaNhomHang(String maNhomHang) {
        this.maNhomHang = maNhomHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public boolean setTenHang(String tenHang) {
        for (int i = 0; i < tenHang.length(); i++) {
            char ch = tenHang.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("Nhập lại tên hàng: ");
                return false;
            }
        }
        this.tenHang = tenHang;
        return true;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public boolean setDonViTinh(String donViTinh) {
        for (int i = 0; i < donViTinh.length(); i++) {
            char ch = donViTinh.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("Nhập lại đơn vị tính: ");
                return false;
            }
        }
        this.donViTinh = donViTinh;
        return true;
    }

    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia= donGia;
    }

    // public boolean setDonGia(double donGia) {
    //     for (int i = 0; i < donGia; i++) {
    //         char ch = donGia.charAt(i);
    //         if (!Character.isDigit(ch)) {
    //             System.out.println("Nhập lại đơn giá: ");
    //             return false;
    //         }
    //     }
    //     this.donGia = donGia;
    //     return true;
    // }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double vAT) {
        VAT = vAT;
    }

    // public String toString() {
    //     return "Hàng hóa{" +
    //             "Mã hàng='" + maHang + '\'' +
    //             ", nhóm hàng='" + nh.getMaNhomHang() + '\'' +
    //             ", tên hàng='" + tenHang + '\'' +
    //             ", đơn vị tính='" + donViTinh + '\'' +
    //             ", đơn giá='" + donGia + '\'' +
    //             ", VAT=" + VAT +
    //             '}';
    // }

}
