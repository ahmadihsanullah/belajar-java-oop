public class ArrayReverse {
    public static void main(String[] args) {
        String[] data = {
                "h", "e", "l", "l", "o"
        };
        System.out.println("Sebelum di reverse");
        for(var value : data){
            System.out.println(value);
        }
        System.out.println("Setelah di reverse");
        reverseArray(data);
    }

    static String[] reverseArray(String[] data){
        var pointer1 = 0;
        var pointer2 = data.length - 1;
        while(pointer1 < pointer2){
            var temp = pointer1;
            data[pointer1] = data[pointer2];
            data[pointer2] = data[temp];
            pointer1 += 1;
            pointer2 -= 1;
        }
        for(var value : data){
            System.out.println(value);
        }
        return data;
    }
}
