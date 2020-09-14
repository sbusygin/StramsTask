import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(13);
        array.addAll(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        for (int i = 0; i < array.size(); ){
            if (array.get(i) > 0) {
                if (array.get(i) % 2 == 0){
                    i++;
                    continue;
                }
                else array.remove(i);

            }
            else array.remove(i);
        }
        Collections.sort(array);
        System.out.println(array);

    }
}
