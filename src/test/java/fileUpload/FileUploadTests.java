package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        String absolutePath = "C:\\Users\\DELL\\Downloads\\SeleniumWebDriverOffline-master\\resourses\\sobhy.txt";
        var FileUploadPage =  homePage.clickFileUpload();
        FileUploadPage.uploadFile(absolutePath);
        assertEquals(FileUploadPage.getUploadedFileName(),"sobhy.txt", "Uploaded file name is incorrect");
    }
}
