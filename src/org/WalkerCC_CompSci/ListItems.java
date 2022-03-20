package org.WalkerCC_CompSci;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListItems {

    public static void main(String[] args) {
        List<String> sports = new ArrayList<>();

        sports.add("Football");
        sports.add("Basketball");
        sports.add("Hockey");
        sports.add("Baseball");
        sports.add("Soccer");

        System.out.println(sports);

        sports.removeAll(Collections.singleton("Basketball"));
        System.out.println(sports);

    }
}


