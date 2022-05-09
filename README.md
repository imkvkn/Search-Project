 **Problem Statement**

You are an Engineer working at XYZ and Your friend Rahul works in Customer Support at the same company. He receives large text files and logs files from customers as a part of support and it's very hard for him to search and understand the context easily.




**Solution**:

**PRIMARY GOAL**


Built a command line application.

Started By Creating Few Services i.e., 

**InputService** for taking Input, 

**FileContentService** for getting the contents of the file and 

**SearchSnippetService** for searching the snippet that matches.


File Path and Search Keyword are received as input from the user.


Sentences matching the search will be displayed in the console.


Note: **Please find the documentation in Document.txt file in resources.**


**SECONDARY GOAL**


The Design Pattern used here is Filter Design Pattern.

Definition: Filter pattern or Criteria pattern is a design pattern that enables developers to 
filter a set of objects using different criteria and chaining them in a decoupled way through 
logical operations. Since, we need to filter the text files using some specified criteria 
ie., using keyword Hence, used this design pattern.



Dependency Tool used is Maven.

Maven is chiefly used for Java-based projects, helping to download dependencies,
which refers to the libraries or JAR files. The tool helps get the right JAR files
for each project as there may be different versions of separate packages.

It is used for getting JUnit dependency which is used for testing.



