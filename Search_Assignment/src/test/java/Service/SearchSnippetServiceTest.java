package Service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SearchSnippetServiceTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void search() {
        SearchSnippetService searchSnippetService=new SearchSnippetService();
        String input="This is a sample test case";
        String snippet="case";
        String expected="This is a sample test case\n=========================================================================\n";
        searchSnippetService.search(input,snippet);
        assertEquals(expected, outContent.toString());
    }
}