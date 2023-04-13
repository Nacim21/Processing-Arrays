
import java.util.*;

public class ArrayProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String controller = "";
        int size = 0 ;
        boolean sentinel = true;


        System.out.println("ENTER ARRAY OF STRINGS BY LINE");
        System.out.println("Type 'Done' when finished");

        // Array Constructor
        while (sentinel) {

            if (!controller.contains("Done")) {
                controller += input.next() + ", ";
                System.out.println(controller);
                size++;

            } else {
                sentinel = false;
                size = size - 1;

            }

        }
        //Declaring the array contents (removing the "Done")
        String[] subFinal = controller.split(",");
        String[] s = new String[size];

        for (int i = 0, k = 0; i < subFinal.length-1; i++) {
            if (i != size){
                s[k] = subFinal[i];
                k++;
            }
        }

        System.out.println("Your final Array");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();

        String[] holder = new String[s.length];


        int i = s.length - 1;
        int j = 0;
        while (j < s.length) {
            String h = s[i];
            holder[j] = h;

            i--;
            j++;

        }


        String[] tmp = new String[holder.length];
        for (i = 0; i < holder.length; i++) {
            tmp[i] = "";
            for (j = holder[i].length() - 1; j >= 0; j--) {

                tmp[i] += holder[i].charAt(j);

            }
        }

        System.out.println("Your reversed Array");
        for (int k = 0; k < tmp.length; k++) {
            System.out.print(tmp[k] + " ");
        }


    }
}






