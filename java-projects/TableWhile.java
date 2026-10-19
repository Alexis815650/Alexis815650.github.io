public class TableWhile {
    public static void main(String[] args) {
        int r=1;
        int c=1;
        while (r<=10) {
            while (c<=10) {
                System.out.print((c*r)+" ");
                c++;
            }
            System.out.println();
            r++;
            c=1;
        }
    }
}