package ApachePOI;

import org.apache.poi.ss.usermodel.*; //* konunca kütüphanedeki her şeyi kapsar

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
//excelden veri okuma
        String path = "src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        // Dosya yı aç yani bağlantı kur
        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);
        // Dosyadaki WorkBook u oku ve Hafızaya yükle
        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);
        // Çalışma sayfasını seç
        Sheet calismaSayfasi = calismaKitabi.getSheetAt(0); // getSheet("isim")
        // Satırı seç
        Row satir = calismaSayfasi.getRow(0);
        // hücreyi oku
        Cell hucre = satir.getCell(0);

        System.out.println("hucre = " + hucre);
    }
}
