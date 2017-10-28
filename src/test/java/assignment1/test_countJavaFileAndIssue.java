//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240359
//Name: #Goay Kai Ling

package assignment1;

import org.junit.Assert;
import org.junit.Test;

public class test_countJavaFileAndIssue extends countJavaFileAndIssue {

    @Test
    public void testCountJavaFile() {
        countJavaFileAndIssue a1 = new countJavaFileAndIssue();
        a1.counting();
        int expectedJavaFileCount = 4;
        int actualJavaFileCount = count;
        Assert.assertEquals(expectedJavaFileCount, actualJavaFileCount);
    }

    @Test
    public void testJavaFileIssue() {
        int expectedJavaFileIssue = 3;
        int actualJavaFileIssue = issueCount;
        Assert.assertEquals(expectedJavaFileIssue, actualJavaFileIssue);
    }

}
