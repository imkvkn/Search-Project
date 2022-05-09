package Service;

import org.junit.Test;
import java.io.FileNotFoundException;


import static org.junit.Assert.*;

public class FileContentServiceTest {

    /**
     * checks if file content is read properly or not
     * @throws FileNotFoundException
     */
    @Test
    public void getFileContent() throws FileNotFoundException {
        FileContentService fileContentService=new FileContentService();
        String content=fileContentService.getFileContent("src/main/resources/Test.txt");
        assertEquals(content,"Hello, This is a sample content Test\n");
    }
}