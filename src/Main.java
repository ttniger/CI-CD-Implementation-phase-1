public class Main {
    public static void main(String[] args) {
        int result = sum1(1,2);
        int difresult = dif(2,1);
        System.out.println(result);
        System.out.println(difresult);

    }

    private static int sum1(int i, int i1) {
        int c = i+i1;
        return c;
    }
    private static int dif(int r, int r1){
        int d = r-r1;
        return d;
    }
}