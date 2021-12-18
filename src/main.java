public class main{
    public static void main(String[] args) {
        int i = Tong(10, 15);
        System.out.println(i);
        int j = Hieu(30, 15);
        System.out.println(j);
        int k = Nhan(30, 15);
        System.out.println(k);
        double m = Chia(30,7);
        System.out.println(m);
        double l = BMI( 70, 1.86);
        System.out.println(l);

        bmi();
        System.out.println(BMI());
    }    public static int Tong( int a, int b){
        return a+b;
    }
    public static int Hieu(int a, int b){
        return a-b;
    }
    public static int Nhan(int a, int b){
        return a*b;
    }
    public static double Chia(double a, double b){
        return a/b;
    }
    public static double BMI(double weight, double height){
        return  weight/(height*height);
    }

    public static double BMI(){
        double weight = 80;
        double height = 1.85;
        return weight/(height*height);
    }
    public static void bmi(){
        double weight = 80;
        double height = 1.85;
        double bmi = weight/(height*height);
        System.out.println(bmi);
    }


}