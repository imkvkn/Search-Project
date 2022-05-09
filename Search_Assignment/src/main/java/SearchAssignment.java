
import Service.FileContentService;
import Service.InputService;
import Service.SearchSnippetService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SearchAssignment {
    public static void main(String[] args) throws FileNotFoundException {
        InputService inputService=new InputService();
        FileContentService fileContentService=new FileContentService();
        SearchSnippetService searchSnippetService=new SearchSnippetService();

        String FILE_PATH=inputService.getFilePath();
        String SEARCH_SNIPPET=inputService.getSearchSnippet();
        String FILE_CONTENT=fileContentService.getFileContent(FILE_PATH);

        searchSnippetService.search(FILE_CONTENT,SEARCH_SNIPPET);
    }
}
