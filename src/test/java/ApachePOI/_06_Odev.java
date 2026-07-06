package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _06_Odev {
    public static void main(String[] args) throws IOException {
          /* Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         src/test/java/ApachePOI/Resource/LoginData.xlsx */
        // TODO: Aynı soruyu main de aranan kelimenin gönderildiği ve metodda bulunan sonucun yine main de yazdırılgığı  şekliyle çözünüz

        Scanner oku = new Scanner(System.in);
        String path = "src/test/java/ApachePOI/Resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        System.out.print("Aranacak kelime:");
        String aranan = oku.nextLine();
        System.out.println(excelKelimeArama(sheet, aranan));
    }

    static String excelKelimeArama(Sheet sheet, String kelime) {
        String sonuc = "";
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (kelime.equalsIgnoreCase(sheet.getRow(i).getCell(0).toString())) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    sonuc = sonuc+sheet.getRow(i).getCell(j) + "\t";
                }
            }
        }
        if (sonuc.isEmpty())
            System.out.println("Aranan kelime bulunamadı");
        return sonuc;
    }

}
