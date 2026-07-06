package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) throws IOException {
        /*
         Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         src/test/java/ApachePOI/Resource/LoginData.xlsx*/
        Scanner oku = new Scanner(System.in);
        String path = "src/test/java/ApachePOI/Resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        System.out.print("Aranacak kelime:");
        String aranan = oku.nextLine();

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (aranan.equalsIgnoreCase(sheet.getRow(i).getCell(0).toString()))
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    System.out.print(sheet.getRow(i).getCell(j) + "\t");
                }
        }
    }

}

