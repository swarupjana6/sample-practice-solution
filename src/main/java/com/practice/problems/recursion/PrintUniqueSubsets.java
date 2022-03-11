package com.practice.problems.recursion;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;

@Log4j2
public class PrintUniqueSubsets {

    public static void main(String[] args) {
        String input = "aaab";
        Set<String> outputs = new HashSet<>();
        solve(input, "", outputs);
        log.info("\nInput\t=> {} \nOutput\t=> {} ", input, String.join(" | ", outputs));
    }

    private static void solve(String input, String output, Set<String> outputs) {
        if (input.length() == 0) {
            //System.out.format(" %s | ", output);
            outputs.add("'" + output + "'");
            return;
        }
        String output1 = output;
        String output2 = output;

        output2 += input.substring(0, 1);
        input = input.substring(1);

        solve(input, output1, outputs);
        solve(input, output2, outputs);
    }
}
