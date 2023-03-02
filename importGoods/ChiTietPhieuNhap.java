package importGoods;

import java.util.Scanner;

import ui.ScannerFactory;
import goods.HangHoa;
import person.NhanVien;

public class ChiTietPhieuNhap {
    private HangHoa maHang;
    private PhieuNhap iDPhieuNhap, kiHieuPN, ngayNhap;
    private double giaNhap;
    private int soLuongNhap;
    private double thanhTien;
    private static int chietKhau;

    public ChiTietPhieuNhap() {

    }

    public ChiTietPhieuNhap(HangHoa maHang, PhieuNhap iDPhieuNhap, PhieuNhap kiHieuPN, PhieuNhap ngayNhap,
            double giaNhap, int soLuongNhap, double thanhTien) {
        this.maHang = maHang;
        this.iDPhieuNhap = iDPhieuNhap;
        this.kiHieuPN = kiHieuPN;
        this.ngayNhap = ngayNhap;
        this.giaNhap = giaNhap;
        this.soLuongNhap = soLuongNhap;
        this.thanhTien = thanhTien;
    }

    Scanner sc = ScannerFactory.getScanner();                               //phương thức static
    HangHoa hh = new HangHoa();
    PhieuNhap np = new PhieuNhap();

    public void input() {
        System.out.print("Nhập mã hàng hóa: ");
        while (true) {
            String maHangInPut = sc.nextLine();
            boolean check = hh.setMaHang(maHangInPut);
            if (check) {
                break;
            }
        }
        System.out.print("nhập giá nhập: ");
        giaNhap = sc.nextDouble();
        System.out.print("nhập số lượng nhập: ");
        soLuongNhap = sc.nextInt();
        System.out.print("nhập tiền đã nhập hàng: ");
        thanhTien = sc.nextDouble();
        sc.nextLine();
    }

    public HangHoa getMaHang() {
        return maHang;
    }

    public void setMaHang(HangHoa maHang) {
        this.maHang = maHang;
    }

    public PhieuNhap getiDPhieuNhap() {
        return iDPhieuNhap;
    }

    public void setiDPhieuNhap(PhieuNhap iDPhieuNhap) {
        this.iDPhieuNhap = iDPhieuNhap;
    }

    public PhieuNhap getkiHieuPN() {
        return kiHieuPN;
    }

    public void setkiHieuPN(PhieuNhap kiHPhieuNhap) {
        this.kiHieuPN = kiHPhieuNhap;
    }

    public PhieuNhap getngayNhap() {
        return ngayNhap;
    }

    public void setngayNhap(PhieuNhap ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public static int getChietKhau() {
        return chietKhau;
    }

    public static void setChietKhau(int chietKhau) {
        ChiTietPhieuNhap.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap [maHang=" + maHang + ", iDPhieuNhap=" + iDPhieuNhap + ", kiHieuPN=" + kiHieuPN
                + ", ngayNhap=" + ngayNhap + ", giaNhap=" + giaNhap + ", soLuongNhap=" + soLuongNhap + ", thanhTien="
                + thanhTien + "]";
    }

    // public static double tongTienNhap(){
    // return ((this.GiaNhap*this.soLuongNhap)- (this.GiaNhap * soLuongNhap*
    // chietKhau));
    // }

}
