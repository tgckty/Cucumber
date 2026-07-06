package ApachePOI;

import org.apache.poi.ss.usermodel.*; //* konunca kütüphanedeki her şeyi kapsar

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
//excelden veri okuma
        String path = "src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // getSheet("isim")

        //row: satır
        //cell: hücre(sütunu temsil ediyor)
        for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"\t");
            }
            System.out.println();
        }
    }
}
