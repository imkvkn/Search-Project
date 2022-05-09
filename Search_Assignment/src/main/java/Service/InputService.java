package Service;

import java.util.Scanner;

public class InputService {
        Scanner sc=new Scanner(System.in);

    /**
     *  Gets file path from user
      * @return absolute file path which is given as input
     */
    public String getFilePath(){
        System.out.println("Please enter the absolute file path");
        String path=this.sc.nextLine();
        return path;
    }

    /**
     * Gets Search Snippet from the user
     * @return search_snippet which is given as input
     */
    public String getSearchSnippet(){
        System.out.println("Please enter the search snippet");
        String search_snippet=sc.nextLine();
        return search_snippet;
    }
}
