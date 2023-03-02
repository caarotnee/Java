package sell;
import java.util.Scanner;
import goods.HangHoa;
import person.KhachHang;
import person.NhanVien;

public class ChiTietPhieuXuat {
    private PhieuXuat idPhieuXuat, kiHieuPX, ngayXuat;
    private KhachHang maKH;
    private NhanVien maNV;
    private HangHoa maHang;
    private double giaBan;
    private int soLuongPX;

    public ChiTietPhieuXuat(){

    }

    public ChiTietPhieuXuat(PhieuXuat idPhieuXuat, KhachHang maKH, NhanVien maNV, PhieuXuat kiHieuPX, PhieuXuat ngayXuat, HangHoa maHang, double giaBan, int soLuongPX) {
        this.idPhieuXuat = idPhieuXuat;
        this.maKH = maKH;
        this.maNV = maNV;
        this.kiHieuPX = kiHieuPX;
        this.ngayXuat = ngayXuat;
        this.maHang = maHang;
        this.giaBan = giaBan;
        this.soLuongPX = soLuongPX;
    }

    Scanner sc= new Scanner(System.in);
    HangHoa hh = new HangHoa();
    PhieuXuat px ;
    NhanVien nv;
    KhachHang kh;
    
    public void input(){
        System.out.print("nhập mã hàng hóa: ");
        while(true){
            String maHangInPut = sc.nextLine();
            boolean check = hh.setMaHang(maHangInPut);
            if (check) {
                break;
            }
        }
        System.out.print("nhập giá bán: ");
        giaBan = sc.nextDouble();
        System.out.print("nhập số lượng phiếu xuất: ");
        soLuongPX = sc.nextInt();
    }

    public PhieuXuat getIdPhieuXuat() {
        return idPhieuXuat;
    }

    public void setIdPhieuXuat(PhieuXuat idPhieuXuat) {
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

    public PhieuXuat getKiHieuPX() {
        return kiHieuPX;
    }

    public void setKiHieuPX(PhieuXuat kiHieuPX) {
        this.kiHieuPX = kiHieuPX;
    }

    public PhieuXuat getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(PhieuXuat ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
    
    public HangHoa getMaHang() {
        return maHang;
    }

    public void setMaHang(HangHoa maHang) {
        // if (maHang != null && maHang.length() == 8) {
        //     this.maHang = maHang;
        //     return true;
        // } else {
        //     System.out.print("Nhập lại mã hàng: ");
        //     return false;
        // }
            this.maHang = maHang;

    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongPX() {
        return soLuongPX;
    }

    public void setSoLuongPX(int soLuongPX) {
        this.soLuongPX = soLuongPX;
    }

    // public int ThanhGia(){
    //     return (soLuongPX * giaBan);
    // }
    @Override
    public String toString() {
        return "ChiTietPhieuXuat [idPhieuXuat=" + idPhieuXuat + ", kiHieuPX=" + kiHieuPX + ", ngayXuat=" + ngayXuat
                + ", maKH=" + maKH + ", maNV=" + maNV + ", maHang=" + hh.getMaHang() + ", giaBan=" + giaBan + ", soLuongPX="
                + soLuongPX + "]";
    }

}
