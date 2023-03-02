package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import goods.HangHoa;

public class HangHoaFile {
    private static final String FILE_NAME = "HangHoa.txt";

    /**
     * save list HangHoa to file
     * 
     * @param hangHoaList: list HangHoa to save
     */
    public void write(List<HangHoa> hangHoaList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(hangHoaList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    /**
     * read list HangHoa from file
     * 
     * @return list HangHoa
     */
    public List<HangHoa> read() {
        List<HangHoa> hangHoaList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);
            hangHoaList = (List<HangHoa>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return hangHoaList;
    }

    /**
     * close input stream
     * 
     * @param is: input stream
     */
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * close output stream
     * 
     * @param os: output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
