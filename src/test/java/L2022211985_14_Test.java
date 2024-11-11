import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 等价类划分原则
 */

public class L2022211985_14_Test {
    String string;
    List<String> truth = new ArrayList<>();


    @Test
    public void valid12IP() {
        string = "255255255255";
        Collections.addAll(truth, "255.255.255.255");
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertTrue("%s should be valid".formatted(string), stringList.equals(truth));
    }


    @Test
    public void valid4IP() {
        string = "0000";
        Collections.addAll(truth, "0.0.0.0");
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertTrue("%s should be valid".formatted(string), stringList.equals(truth));
    }


    @Test
    public void valid6IP() {
        string = "101023";
        Collections.addAll(truth, "1.0.10.23", "1.0.102.3", "10.1.0.23","10.10.2.3","101.0.2.3");
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertTrue("%s should be valid".formatted(string), stringList.equals(truth));
    }

    @Test
    public void invalid3IP() {
        string = "102";
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertTrue("%s should be invalid".formatted(string), stringList.equals(truth));
    }

    @Test
    public void invalid13IP() {
        string = "1021231231231";
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertTrue("%s should be invalid".formatted(string), stringList.equals(truth));
    }


    @Test
    public void invalid7IP() {
        string = "10102@3";
        Solution solution = new Solution();
        List<String> stringList = solution.restoreIpAddresses(string);
        assertFalse("%s should be invalid".formatted(string), stringList.equals(truth));
    }
}