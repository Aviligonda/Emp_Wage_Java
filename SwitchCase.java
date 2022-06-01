public class SwitchCase {
     public  static final int Wage_per_hr = 20;
     public static final int Full_day_hr = 8;
     public static final int Half_day_hr = 4;
     public static final int Full_Day_Present = 1;
    public static final int Half_Day_Present = 2;

    public static void main(String[] args) {
        int daily_wage;
        int random = (int) (Math.random() * 3);
        switch (random) {
            case Full_Day_Present ->  {
                System.out.println("Employee is present in full day");
                daily_wage=Full_day_hr*Wage_per_hr;
                System.out.println("Employee daily wage is ="+daily_wage);
            }
            case Half_Day_Present -> {
                System.out.println("Employee is present in half day");
                daily_wage=Half_day_hr*Wage_per_hr;
                System.out.println("Employee daily wage is ="+daily_wage);
            }
            default -> {
                daily_wage=0;
                System.out.println("Employee is absent");
                System.out.println("Employee daily wage is ="+daily_wage);
            }
        }
    }
}
