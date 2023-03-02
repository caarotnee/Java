package sell;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import person.KhachHang;
import person.NhanVien;

public class PhieuXuat {
    private String idPhieuXuat;
    private KhachHang maKH;
    private NhanVien maNV;
    private String kiHieuPX;
    private String ngayXuat;

    public PhieuXuat() {
    }

    public PhieuXuat(String idPhieuXuat, KhachHang maKH, NhanVien maNV, String kiHieuPX, String ngayXuat) {
        this.idPhieuXuat = idPhieuXuat;
        this.maKH = maKH;
        this.maNV = maNV;
        this.kiHieuPX = kiHieuPX;
        this.ngayXuat = ngayXuat;
    }

    Scanner sc = new Scanner(System.in);
    NhanVien nv = new NhanVien();
    KhachHang kh = new KhachHang();

    public void input() {
        System.out.print("nhập id phiếu xuất: ");
        idPhieuXuat = sc.nextLine();

        System.out.print("nhập mã khách hàng: ");
        while (true) {
            String maKH = sc.nextLine();
            boolean check = kh.setMa(maKH);
            if (check) {
                break;
            }
        }

        System.out.print("nhập mã nhân viên:");
        while (true) {
            String maNV = sc.nextLine();
            boolean check = nv.setMa(maNV);
            if (check) {
                break;
            }
        }

        System.out.print("nhập kí hiệu phiếu xuất: ");
        kiHieuPX = sc.nextLine();

        System.out.print("nhập ngày xuất đơn: ");
        while(true)
        {
            String ngayXuat = sc.nextLine();
            boolean check = setNgayXuat(ngayXuat);
            if (check)
            {
                break;
            }
        }
        // ngayXuat = sc.nextLine();
    }

    public String getIdPhieuXuat() {
        return idPhieuXuat;
    }

    public void setIdPhieuXuat(String idPhieuXuat) {
        this.idPhieuXuat = idPhieuXuat;
    }

    public KhachHang getMaKH() {
        return maKH;
    }

    public void setMaKH(KhachHang maKH) {
        this.maKH = maKH;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public String getKiHieuPX() {
        return kiHieuPX;
    }

    public void setKiHieuPX(String kiHieuPX) {
        this.kiHieuPX = kiHieuPX;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public boolean setNgayXuat(String ngayXuat) {
        // this.ngayXuat = ngayXuat;

        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        df.setLenient(false);
        try {
            df.parse(ngayXuat);
        } catch (ParseException e) {
            System.out.print("Nhập lại ngày xuất : ");
            return false;
        }
        this.ngayXuat = ngayXuat;
        return true;

    }

    @Override
    public String toString() {
        return "PhieuXuat [idPhieuXuat=" + idPhieuXuat + ", maKH=" + kh.getMa() + ", maNV=" + nv.getMa() + ", kiHieuPX="
                + kiHieuPX
                + ", ngayXuat=" + ngayXuat + "]";
    }

}
