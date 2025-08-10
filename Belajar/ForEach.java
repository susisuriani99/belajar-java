public class ForEach {
    public static void main(String[] args) {
        String[] array = {
            "Buku", "Pensil", "Penghapus","Penggaris", "Pulpen", "Tipex"
        };

        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String name: array) {
            if (name.charAt(0) != 'P') {
                continue;
            }
            System.out.println(name);
        }
    }
}
