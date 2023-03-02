package manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sell.ChiTietPhieuXuat;


public class DSChiTietPX {
    private ArrayList<ChiTietPhieuXuat> chitietpx;
    
    public DSChiTietPX() {
        this.chitietpx = new ArrayList<ChiTietPhieuXuat>();
    }
    public DSChiTietPX(ArrayList<ChiTietPhieuXuat> chitietpx) {
        this.chitietpx = chitietpx;
    }

    Scanner sc = new Scanner(System.in);
    // thêm 
    public void addChiTietPX(ChiTietPhieuXuat chitietpx) {
        this.chitietpx.add(chitietpx);
    }         

    //xóa 
    public boolean deleteChitietPX(String id) {
        ChiTietPhieuXuat px = this.chitietpx.stream().filter // tìm id
        (chitietpx -> chitietpx.getIdPhieuXuat().equals(id)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (chitietpx == null)
            return false;
        this.chitietpx.remove(px);
        return true;
    }
    
    // sửa 
    // public boolean fixChiTietPX(String id1, String id2){
    //     PhieuXuat px = new PhieuXuat();
    //     ChiTietPhieuXuat ctpx = this.chitietpx.stream().filter(ChiTietPhieuXuat -> ChiTietPhieuXuat.getIdPhieuXuat().equals(id1)).findFirst().orElse(null);    
    //     if (chitietpx == null)
    //         return false;
    //     ctpx.setIdPhieuXuat(id2);  
    //         return true;                
    // }


    //tìm kiếm theo tên 
    public boolean searchChiTietPX(String id) {
        ChiTietPhieuXuat ctpx = this.chitietpx.stream().filter // tìm tên
        (phieuxuat -> phieuxuat.getIdPhieuXuat().equals(id)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (chitietpx == null)
            return false;
        this.chitietpx.stream().filter(PS -> PS instanceof ChiTietPhieuXuat).forEach(PS -> System.out.println(PS.toString()));
            return true;
    }

    //in DS
    public void showChiTietPX() {
        this.chitietpx.forEach(chitietpx -> System.out.println(chitietpx.toString()));
    }

    //ghi file
    public void ghifile(ChiTietPhieuXuat chitietpx){
        
       try {
            // fileWriter pw = new PrintWriter("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/nhanvien.txt", "UTF-8");
            FileWriter fw = new FileWriter("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/chitietpx.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(chitietpx.toString());
            bw.newLine();
            fw.flush();
            bw.close();
            fw.close();
       } catch (Exception e) {
            e.printStackTrace();
       }
       
    }

    //doc file
    public void docfile(ChiTietPhieuXuat chitietpx){
        File f = new File("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/chitietpx.txt");
        try{
            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : allText){
                System.out.println(line);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
