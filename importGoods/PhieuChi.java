package importGoods;

import java.util.Scanner;
import person.NhanVien;

public class PhieuChi {
    private int soPhieuChi;
    private NhanVien maNV;
    private PhieuNhap iDPhieuNhap;
    private String tenNguoiChi;
    private String ngayChi;
    private String lyDoChi;
    private double soTienChi;
    private String soTienBangChu;
    private String ghiChu;

    public PhieuChi(){

    }

    public PhieuChi(int soPhieuChi, NhanVien maNV, PhieuNhap iDPhieuNhap, String tenNguoiChi, String ngayChi,
            String lyDoChi, double soTienChi, String soTienBangChu, String ghiChu) {
        this.soPhieuChi = soPhieuChi;
        this.maNV = maNV;
        this.iDPhieuNhap = iDPhieuNhap;
        this.tenNguoiChi = tenNguoiChi;
        this.ngayChi = ngayChi;
        this.lyDoChi = lyDoChi;
        this.soTienChi = soTienChi;
        this.soTienBangChu = soTienBangChu;
        this.ghiChu = ghiChu;
    }

    Scanner input = new Scanner(System.in);

    public int getSoPhieuChi() {
        return soPhieuChi;
    }

    public void setSoPhieuChi(int soPhieuChi) {
        
        this.soPhieuChi = soPhieuChi;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        
        this.maNV = maNV;
    }

    public PhieuNhap getiDPhieuNhap() {
        return iDPhieuNhap;
    }

    public void setiDPhieuNhap(PhieuNhap iDPhieuNhap) {
        
        this.iDPhieuNhap = iDPhieuNhap;
    }

    public String getTenNguoiChi() {
        return tenNguoiChi;
    }

    public void setTenNguoiChi(String tenNguoiChi) {
        
        this.tenNguoiChi = tenNguoiChi;
    }

    public String getNgayChi() {
        return ngayChi;
    }

    public void setNgayChi(String ngayChi) {
        
        this.ngayChi = ngayChi;
    }

    public String getLyDoChi() {
        return lyDoChi;
    }

    public void setLyDoChi(String lyDoChi) {
        
        this.lyDoChi = lyDoChi;
    }

    public double getSoTienChi() {
        return soTienChi;
    }

    public void setSoTienChi(double soTienChi) {
        
        this.soTienChi = soTienChi;
    }

    public String getSoTienBangChu() {
        return soTienBangChu;
    }

    public void setSoTienBangChu(String soTienBangChu) {
        
        this.soTienBangChu = soTienBangChu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "PhieuChi [soPhieuChi=" + soPhieuChi + ", maNV=" + maNV + ", iDPhieuNhap=" + iDPhieuNhap
                + ", tenNguoiChi=" + tenNguoiChi + ", ngayChi=" + ngayChi + ", lyDoChi=" + lyDoChi + ", soTienChi="
                + soTienChi + ", soTienBangChu=" + soTienBangChu + ", ghiChu=" + ghiChu + "]";
    }
    
    
}

