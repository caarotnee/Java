package manager;

import person.NhanVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import importGoods.PhieuNhap;
import person.KhachHang;
import person.NhanVien;
import person.Person;

public class DSPerson {
    private ArrayList<Person> person;

    public DSPerson() {
        this.person = new ArrayList<Person>();
    }

    public DSPerson(ArrayList<Person> person) {
        this.person = person;
    }

    Scanner sc = new Scanner(System.in);

    // thêm
    public void addPerson(Person person) {
        this.person.add(person);
    }

    // xóa
    public boolean deletePerson(String name) {
        Person ps = this.person.stream().filter // tìm tên
        (person -> person.getTen().equals(name)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (person == null)
            return false;
        this.person.remove(ps);
        return true;
    }

    // sửa
    public boolean fixPerson(String name1, String name2) {
        Person ps = this.person.stream().filter(Person -> Person.getTen().equals(name1)).findFirst().orElse(null);
        if (person == null)
            return false;
        ps.setTen(name2);
        return true;
    }

    // tìm kiếm theo tên
    public boolean searchNhanVien(String name) {
        Person ps = this.person.stream().filter // tìm tên
        (person -> person.getTen().equals(name)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (person == null)
            return false;
        this.person.stream().filter(PS -> PS instanceof NhanVien).forEach(PS -> System.out.println(PS.toString()));
            return true;
    }

    public boolean searchKhachHang(String name) {
        Person ps = this.person.stream().filter // tìm tên
        (person -> person.getTen().equals(name)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (person == null)
            return false;
        this.person.stream().filter(PS -> PS instanceof KhachHang).forEach(PS -> System.out.println(PS.toString()));
            return true;
    }

    // in DS
    public void showInfor() {
        this.person.forEach(person -> System.out.println(person.toString()));
    }

    // ghi file
    public void ghifile(Person person) {

        try {
            // fileWriter pw = new PrintWriter("C:/Users/thinh/OneDrive/Máy
            // tính/Do_An/file/nhanvien.txt", "UTF-8");
            FileWriter fw = new FileWriter("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/nhanvien.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(person.toString());
            bw.newLine();
            fw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // doc file
    public void docfile(Person person) {
        File f = new File("C:/Users/thinh/OneDrive/Máy tính/Do_An/file/nhanvien.txt");
        try {
            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertPN(PhieuNhap pn) {
    }
    
}
