package Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentService {

    /**
     * Gets File Content from the given File using FilePath
     * @param FILE_PATH
     * @return FILE_CONTENT
     * @throws FileNotFoundException
     */
    public String getFileContent(String FILE_PATH) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
        String content = "";
        try {

            StringBuilder build_content = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                build_content.append(line);
                build_content.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            content = build_content.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
