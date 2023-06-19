import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] data = {
                "halo", "hanif"
        };
        System.out.println("Sebelum di reverse");
        System.out.println(Arrays.toString(data));
        System.out.println("Setelah di reverse");
        System.out.println(Arrays.toString(reverseArray(data)));
    }

    static String[] reverseArray(String[] data){
        for (int i = 0; i < data.length /2 ; i++) {
            String temp = data[i];
            data[i] = data[data.length - i -1];
            data[data.length - i -1] = temp;
        }
        return data;
    }
}
