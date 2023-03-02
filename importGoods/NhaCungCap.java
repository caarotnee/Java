package importGoods;

import java.util.Scanner;

public class NhaCungCap {
    private String maNCC;
    private String tenNCC;
    private String diaChiNCC;
    private int sDTNCC;
    private int soTaiKhoanNCC;
    private int maSoThueNCC;

    public NhaCungCap(){

    }

    public NhaCungCap(String maNCC, String tenNCC, String diaChiNCC, int sDTNCC, int soTaiKhoanNCC, int maSoThueNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChiNCC = diaChiNCC;
        this.sDTNCC = sDTNCC;
        this.soTaiKhoanNCC = soTaiKhoanNCC;
        this.maSoThueNCC = maSoThueNCC;
    }

    Scanner input= new Scanner(System.in);

    public String getMaNCC() {
        return maNCC;
    }

    public boolean setMaNCC(String maNCCinput) {
        if (maNCCinput == null) {
        System.out.print("Vui lòng lại mã nhà cung cấp : ");
        return false;
        }
        this.maNCC = maNCCinput;
        return true;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        String name;
        System.out.println("Nhập tên nhà cung cấp:");
        name = input.nextLine();
        if (!name.matches("[a-zA-Z_]+")) {
            System.out.println("Chỉ nhập chữ");
        }
        this.tenNCC = tenNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public int getsDTNCC() {
        return sDTNCC;
    }

    public void setsDTNCC(int sDTNCC) {
       
        this.sDTNCC = sDTNCC;
    }

    public int getSoTaiKhoanNCC() {
        return soTaiKhoanNCC;
    }

    public void setSoTaiKhoanNCC(int soTaiKhoanNCC) {
        this.soTaiKhoanNCC = soTaiKhoanNCC;
    }

    public int getMaSoThuaNCC() {
        return maSoThueNCC;
    }

    public void setMaSoThuaNCC(int maSoThueNCC) {
        this.maSoThueNCC = maSoThueNCC;
    }
}

