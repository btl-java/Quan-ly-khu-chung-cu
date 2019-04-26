/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

/**
 *
 * @author quocc
 */
public class CreateContract {

    public void CreateContract() throws Exception {
        //tao file word
        XWPFDocument document = new XWPFDocument();

        //tao doan van ban
        //slogan
        XWPFParagraph slogan = document.createParagraph();
        XWPFRun run = slogan.createRun();
        slogan.setAlignment(ParagraphAlignment.CENTER);
        String title = "CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM";
        run.setFontSize(14);
        run.setFontFamily("Times New Roman");
        run.setBold(true);
        run.setText(title);
        run.addBreak();
        String title1 = "Độc lập - Tự Do - Hạnh phúc";
        run.setText(title1);
        run.addBreak();
        String title4 = "------------";
        run.setText(title4);
        run.addBreak();
        String title2 = "HỢP ĐỒNG MUA BÁN CHUNG CƯ";
        run.setText(title2);
        run.addBreak();
        String title3 = "Số:......./HD";
        run.setText(title3);
        //Paragraph 1
        XWPFParagraph para1 = document.createParagraph();
        para1.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun runPara1 = para1.createRun();
        String text1 = "Căn cứ";
        runPara1.setText(text1);
        runPara1.setBold(true);;
        runPara1.setUnderline(UnderlinePatterns.THICK);
        //Para2
        XWPFParagraph para2 = document.createParagraph();
        XWPFRun runPara2 = para2.createRun();
        String text2 = "-  Các quy định pháp luật hiện hành.";
        String text3 = "-  Các quyết định phê duyệt dự án.";
        runPara2.setText(text2);
        runPara2.addBreak();
        runPara2.setText(text3);
        runPara2.addBreak();
        runPara2.addBreak();
        String text4 = "Hôm nay, ngày.....tháng.....năm....., tại............., hai bên chúng tôi gồm:";
        runPara2.setText(text4);
        runPara2.addBreak();
        //Para3 Bên bán
        
        
        //ghi file
        try {
            FileOutputStream out = new FileOutputStream(new File("E:\\Git\\Quan-ly-khu-chung-cu\\Hợp đồng mua chung cư Anland Complex.docx.docx"));
            document.write(out);
            out.close();
            document.close();
            System.out.println("Tạo thành công.");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
