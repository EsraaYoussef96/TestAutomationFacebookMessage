package Readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {
    static FileInputStream fis =null;

    public FileInputStream getFis(){
        String filepath = System.getProperty("user.dir")+"//src//test//test-resources//Userdata.xlsx";
        File SrcFile = new File(filepath);
        try {
            fis= new FileInputStream(SrcFile);
        } catch (FileNotFoundException e) {
            System.out.println("Test data file not found"+e.getMessage());
            return fis;
        }
    }
//public Object[][] getExcelData();
{
    fis =getFis();
    

}
}
