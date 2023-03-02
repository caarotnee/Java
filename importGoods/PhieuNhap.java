package importGoods;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import person.NhanVien;
import ui.ScannerFactory;

public class PhieuNhap {
    private String iDPhieuNhap;
    private NhaCungCap maNCC;
    private NhanVien maNV;
    private String kyHieu;
    private String ngayNhap;

    public PhieuNhap(){

    }
    
    public PhieuNhap(String iDPhieuNhap, NhaCungCap maNCC, NhanVien maNV, String kyHieu, String ngayNhap) {
        this.iDPhieuNhap = iDPhieuNhap;
        this.maNCC = maNCC;
        this.maNV = maNV;
        this.kyHieu = kyHieu;
        this.ngayNhap = ngayNhap;
    }
    Scanner sc = ScannerFactory.getScanner();
    NhanVien nv = new NhanVien();
    NhaCungCap ncc = new NhaCungCap();
    public void inPutPN()
    {
        System.out.print("Nhập id Phiếu nhập : ");
        while (true)
        {
            String idPhieuNhapInPut = sc.nextLine();
            boolean check = setiDPhieuNhap(idPhieuNhapInPut);
            if (check)
            {
                break;
            }
        }

        System.out.print("Nhập mã nhà cung cấp : ");
        while(true)
        {
            String maNCCinput = sc.nextLine();
            boolean check = ncc.setMaNCC(maNCCinput);
            if (check)
            {
                break;
            }
        }

        System.out.print("Nhập mã nhân viên : ");
        nv.setMa(sc.nextLine());

        System.out.print("Nhập kí hiệu : ");
        while(true)
        {
            String kyHieu = sc.nextLine();
            boolean check = setKyHieu(kyHieu);
            if (check)
            {
                break;
            }
        }

        System.out.print("Nhập ngày nhập : ");
        while(true)
        {
            String ngayNhap = sc.nextLine();
            boolean check = setNgayNhap(ngayNhap);
            if (check)
            {
                break;
            }
        }
    }

    Scanner input= new Scanner(System.in);
    public String getiDPhieuNhap() {
        return iDPhieuNhap;
    }

    public boolean setiDPhieuNhap(String iDPhieuNhap) {
        for (int i = 0; i < iDPhieuNhap.length() ; i++)
        {
            char ch = iDPhieuNhap.charAt(i);
            if (!Character.isDigit(ch))
            {
                System.out.print("Nhập lại id phiếu nhập : ");
                return false;
            }
        }
        this.iDPhieuNhap = iDPhieuNhap;
        return true;
    }

    public NhaCungCap getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(NhaCungCap maNCC) {
        this.maNCC = maNCC;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public boolean setKyHieu(String kyHieu) 
    {
        if (kyHieu != null && kyHieu.length() == 4)
        {
            this.kyHieu = kyHieu;
            return true;
        }
        else 
        {
            System.out.print("Nhập lại kí hiệu : ");
            return false;
        }
        
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public boolean setNgayNhap(String ngayNhap) {
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        df.setLenient(false);
        try
        {
            df.parse(ngayNhap); 
        }
        catch (ParseException e) 
        {
            System.out.print("Nhập lại ngày nhập : ");
            return false;
        }
        this.ngayNhap = ngayNhap;
        return true;
    }

    @Override
    public String toString() {
        return "Phiếu nhập {"+"ID phiếu nhập =' " + iDPhieuNhap +  '\'' + ", mã NCC = '" + ncc.getMaNCC() + '\'' 
                + ", mã NV ='" + nv.getMaBP() +  '\'' + ", ký hiệu ='" + kyHieu +  '\'' + ", ngày nhập='"
                + ngayNhap + "}" ;
    }   
}

