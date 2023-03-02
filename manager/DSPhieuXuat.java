package manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sell.PhieuXuat;

public class DSPhieuXuat {
    private ArrayList<PhieuXuat> phieuxuat;
    
    public DSPhieuXuat() {
        this.phieuxuat = new ArrayList<PhieuXuat>();
    }
    public DSPhieuXuat(ArrayList<PhieuXuat> phieuxuat) {
        this.phieuxuat = phieuxuat;
    }

    Scanner sc = new Scanner(System.in);
    // thêm 
    public void addPhieuXuat(PhieuXuat phieuxuat) {
        this.phieuxuat.add(phieuxuat);
    }         

    //xóa 
    public boolean deletePhieuXuat(String id) {
        PhieuXuat PX = this.phieuxuat.stream().filter // tìm id
        (phieuxuat -> phieuxuat.getIdPhieuXuat().equals(id)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (phieuxuat == null)
            return false;
        this.phieuxuat.remove(PX);
        return true;
    }
    
    // sửa 
    public boolean fixPhieuXuat(String id1, String id2){
        PhieuXuat PX = this.phieuxuat.stream().filter
        (PhieuXuat -> PhieuXuat.getIdPhieuXuat().equals(id1)).findFirst().orElse(null);               
        if (phieuxuat == null)
            return false;
        PX.setIdPhieuXuat(id2);  
            return true;                
    }


    //tìm kiếm theo id 
    public boolean searchPhieuXuat(String id) {
        PhieuXuat px = this.phieuxuat.stream().filter // tìm tên
        (phieuxuat -> phieuxuat.getIdPhieuXuat().equals(id)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (phieuxuat == null)
            return false;
        this.phieuxuat.stream().filter(PS -> PS instanceof PhieuXuat).forEach(PS -> System.out.println(PS.toString()));
            return true;
    }

    //in DS
    public void showPhieuXuat() {
        this.phieuxuat.forEach(phieuxuat -> System.out.println(phieuxuat.toString()));
    }

    //ghi file
    public void ghifile(PhieuXuat phieuxuat){
        
       try {
            FileWriter fw = new FileWriter("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/phieuxuat.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(phieuxuat.toString());
            bw.newLine();
            fw.flush();
            bw.close();
            fw.close();
       } catch (Exception e) {
            e.printStackTrace();
       }
       
    }

    //doc file
    public void docfile(PhieuXuat phieuxuat){
        File f = new File("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/phieuxuat.txt");
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
