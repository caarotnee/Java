package person;

import java.util.Scanner;

public class NhanVien extends Person {

    private String namSinh;
    public String tenBP;
    private int maBP;
    public String tenCV;
    public int maCV;
    Scanner sc = new  Scanner(System.in);

    
    public NhanVien(){
    }

    public NhanVien(String ma, String ten, String sdt, String gioitinh, String diachi, String namSinh, String tenBP, int maBP, String tenCV, int maCV) {
        super(ma, ten, sdt, gioitinh, diachi);
        this.namSinh = namSinh;
        this.tenBP = tenBP;
        this.maBP = maBP;
        this.tenCV = tenCV;
        this.maCV = maCV;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();

        System.out.print("nhập ngày sinh: ");
        namSinh = sc.nextLine();

        System.out.print("nhập mã bộ phận: ");
        maBP = sc.nextInt();
        
        System.out.print("nhập tên bộ phận: ");
        sc.nextLine();
        tenBP = sc.nextLine();

        System.out.print("nhập tên chức vụ: ");
        tenCV = sc.nextLine();

        System.out.print("nhập mã chức vụ: ");
        maCV = sc.nextInt();
    }
    
    public String getNamSinh(){
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }


    public String getTenBP() {
        return tenBP;
    }

    public void setTenBP(String tenBP) {
        this.tenBP = tenBP;
    }

    public int getMaBP() {
        return maBP;
    }

    public void setMaBP(int maBP) {
        this.maBP = maBP;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {

        this.tenCV = tenCV;
    }

    public int getMaCV() {
        return maCV;
    }

    public void setMaCV(int maCV) {
        
        this.maCV = maCV;
    }

    @Override
    public String toString() {
        return "NhanVien [ma=" + getMa()+ ", ten=" + getTen() + ", gioitinh=" + getGioitinh() + ",daichi=" + getDiachi() + ",sdt=" 
        + getSdt() + ", namSinh=" + namSinh + ", tenBP=" + tenBP + ", maBP=" + maBP + ", tenCV=" + tenCV + ", maCV="
                + maCV + "]";
    }

}
