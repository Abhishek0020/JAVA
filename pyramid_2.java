public class pyramid_2 {
    public static void main(String[] args) {
        int count=5;
        for (int i = 0; i <=count; i++) {
            for (int j = count; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
