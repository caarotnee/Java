package person;

import java.util.Scanner;

public class KhachHang extends Person {
    private int sCMND;
    private int sTKKH;
    private int maSoThue;


    public KhachHang() {

    }

    public KhachHang(String ma, String ten, String sdt, String gioitinh, String diachi, int sCMND, int sTKKH,
            int maSoThue) {
        super(ma, ten, sdt, gioitinh, diachi);
        this.sCMND = sCMND;
        this.sTKKH = sTKKH;
        this.maSoThue = maSoThue;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();

        System.out.print("nhập số CMND: ");
        sCMND = sc.nextInt();

        System.out.print("nhập số TKHH: ");
        sTKKH = sc.nextInt();

        System.out.print("nhập mã số thuế: ");
        sc.nextLine();
        maSoThue = sc.nextInt();
    }

    public int getsCMND() {
        return sCMND;
    }

    public void setsCMND(int sCMND) {
        this.sCMND = sCMND;
    }

    public int getsTKKH() {
        return sTKKH;
    }

    public void setsTKKH(int sTKKH) {
        this.sTKKH = sTKKH;
    }

    public int getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(int maSoThue) {
        this.maSoThue = maSoThue;
    }

    @Override
    public String toString() {
        return "KhachHang [ma=" + getMa() + ", ten=" + getTen() + ", gioitinh=" + getGioitinh() + ",daichi="
                + getDiachi() + ",sdt="
                + getSdt() + ", sCMND=" + sCMND + ", sTKKH=" + sTKKH + ", maSoThue=" + maSoThue + "]";
    }

    // Scanner sc = new Scanner(System.in);
    // public void nhap(){
    // super.nhap();
    // System.out.print("nhập số CCCD: ");
    // sCMND = sc.nextInt();
    // System.out.print("nhập số tài khoản khách hàng: ");
    // sTKKH = sc.nextInt();
    // System.out.print("nhập mã số thuế: ");
    // maSoThue = sc.nextInt();
    // }
    // @Override
    // public void tenNguoiKeThua() {
    // System.out.println("khách hàng");
    // super.xuat();
    // System.out.println("nhập số CCCD: "+sCMND);
    // System.out.println("nhập số tài khoản khách hàng: "+sTKKH);
    // System.out.println("nhập mã số thuế: "+ maSoThue);

    // }

}
