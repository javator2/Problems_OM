package com.sda.problems;

import java.util.ArrayList;
import java.util.List;

public class Problems {
    public static String last(List<String> asList) {
        return asList.get(asList.size()-1);
    }

    public static Integer secondLast(List<Integer> numbers) {
        return numbers.get(numbers.size()-2);
    }

    public static int length(List<Object> emptyList) {
        return emptyList.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reverceNmbers = new ArrayList<>();
        for (int i=numbers.size()-1; i>=0;i--){
            reverceNmbers.add(numbers.size()-i-1,numbers.get(i));
        }
        return reverceNmbers;
    }

    public static List<String> duplicate(List<String> asList) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i == (duplicates.size()) * 2; i++){
            duplicates.add(i, String.valueOf(duplicates));
            duplicates.add(i, String.valueOf(duplicates));
        }
        return duplicates;
    }
}
