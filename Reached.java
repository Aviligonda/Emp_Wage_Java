public class Reached {
    public static final int Wage_per_hr = 20;
    public static final int Full_day_hr = 8;
    public static final int Half_day_hr = 4;
    public static final int Total_Working_Days = 20;
    public static final int Total_Working_Hours = 100;
    public static final int Full_Day_Present = 1;
    public static final int Half_Day_Present = 2;

    public static void main(String[] args) {
        int totalemphr = 0, totalworkingdays = 0, daily_wage, monthlyWage;
        while (totalemphr <= Total_Working_Hours && totalworkingdays < Total_Working_Days) {
            totalworkingdays++;
            int random = (int) (Math.random() * 3);
            switch (random) {
                case Full_Day_Present -> {
                    System.out.println("Employee is present in full day");
                    daily_wage = Full_day_hr * Wage_per_hr;
                    System.out.println("Employee daily wage is =" + daily_wage);
                    monthlyWage = Total_Working_Days * daily_wage;
                    System.out.println("Employee monthly wage is =" + monthlyWage);
                    totalemphr+=Full_day_hr;
                    System.out.println("Day#:" + totalworkingdays + " EmpHr:" + Full_day_hr);
                }
                case Half_Day_Present -> {
                    System.out.println("Employee is present in half day");
                    daily_wage = Half_day_hr * Wage_per_hr;
                    System.out.println("Employee daily wage is =" + daily_wage);
                    monthlyWage = Total_Working_Days * daily_wage;
                    System.out.println("Employee monthly wage is =" + monthlyWage);
                    totalemphr+=Half_day_hr;
                    System.out.println("Day#:" + totalworkingdays + " EmpHr:" + Half_day_hr);
                }
                default -> {
                    daily_wage = 0;
                    System.out.println("Employee is absent");
                    System.out.println("Employee daily wage is =" + daily_wage);
                    System.out.println("Day#:" + totalworkingdays + " EmpHr:" + daily_wage);
                }


            }
        }
    }
}