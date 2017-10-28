//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240359
//Name: #Goay Kai Ling
package assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class countJavaFileAndIssue {

    static final String FOLDERNAME = "javaFolder";
    static final String[] issueKeywords = {"public static void main(String[] args)", "public static void main(String args[])"};
    static int count;
    static int issueCount;
    
    public static void main(String[] args) {
        countJavaFileAndIssue a1=new countJavaFileAndIssue();
        a1.counting();
        System.out.println("Number of Java Files = " + count);
        System.out.println("Number of Issue = " + issueCount);
    }
    
    public void counting(){
        File f = new File(FOLDERNAME);
        File[] fileNo = f.listFiles();
        //System.out.println(f);
        if (fileNo != null) {
            for (int i = 0; i < fileNo.length; i++) {
                if (fileNo[i].getName().endsWith(".java")) {
                    //System.out.println(fileNo[i]);
                    count++;
                    try (BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()+File.separator+ fileNo[i].getName()))) {
                        String sCurrentLine;

                        while ((sCurrentLine = br.readLine()) != null) {
                            //System.out.println(sCurrentLine);
                            if (sCurrentLine.contains(issueKeywords[0]) || sCurrentLine.contains(issueKeywords[1])) {
                                issueCount++;
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Invalid directory");
        }
    }

}
