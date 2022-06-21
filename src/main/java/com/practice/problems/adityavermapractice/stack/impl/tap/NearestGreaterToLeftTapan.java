package com.practice.problems.adityavermapractice.stack.impl.tap;

import com.practice.problems.adityavermapractice.stack.NearestGreaterToLeft;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToLeftTapan extends NearestGreaterToLeft {

    @Override
    public List<Integer> nearestGreaterToLeft(List<Integer> inputList, int pseudoIndex) {
        Stack<Integer> indexStack = new Stack<>();
        List<Integer> outputList = new LinkedList<>();

        for (int i = 0; i < inputList.size(); i++) {
            int currentElement = inputList.get(i);

            if (indexStack.isEmpty())
                outputList.add(pseudoIndex);
            else if (inputList.get(indexStack.peek()) > currentElement)
                outputList.add(indexStack.peek());
            else if (inputList.get(indexStack.peek()) <= currentElement) {

                while (!indexStack.isEmpty() && inputList.get(indexStack.peek()) <= currentElement)
                    indexStack.pop();

                outputList.add(indexStack.isEmpty() ? pseudoIndex : indexStack.peek());
            }

            indexStack.add(i);
        }

        return outputList;
    }
}
