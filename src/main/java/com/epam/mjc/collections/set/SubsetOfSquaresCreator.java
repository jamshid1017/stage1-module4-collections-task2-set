package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer : sourceList) {
            int square = integer * integer;
            if (square >= lowerBound && square <= upperBound){
                set.add(square);
            }
        }
        return set;
    }
}
