package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchSnippetService {


    String sentence_pattern="[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)";
    Pattern pattern = Pattern.compile(sentence_pattern, Pattern.MULTILINE | Pattern.COMMENTS);


    /**
     * Searches and Calls Print Matching Snippet
     * @param file_content
     * @param search_snippet
     */
    public void search(String file_content, String search_snippet) {
        Matcher matcher = pattern.matcher(file_content);
        searchAndPrintResults(matcher,search_snippet);
    }

    /**
     * Prints all the sentences which contains the search_snippet
     * @param matcher
     * @param search_snippet
     */
    private void searchAndPrintResults(Matcher matcher,String search_snippet) {
        while (matcher.find()) {
            //input_data.add(reMatcher.group());
            //System.out.println(reMatcher.group());
            if(matcher.group().toLowerCase().contains(search_snippet))
            {
                System.out.println(matcher.group());
                System.out.println("=========================================================================");
            }
        }
    }
}
