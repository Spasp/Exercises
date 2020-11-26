package gr.codehub.pf.exercise.CakeRecipe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        CakeRecipe cake = new CakeRecipe();
        List<String> recipeList = new ArrayList<>(cake.getRecipeLines());
        List<String> lines = new ArrayList<>();
        String[] words;
        String word = new String();
        Map<String, HashSet<Integer>> count = new HashMap();


        int i = 0;


        for (String line : recipeList) {
            lines.add(line);
            word = lines.get(i);

            words = word.split(" ");


            for (String s : words) {

                if (count.get(s) == null) {

                    count.put(s, new HashSet<Integer>());
                }


                count.get(s).add(i);


            }
            i++;


        }


        for (Map.Entry<String, HashSet<Integer>> e : count.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

    }
}
