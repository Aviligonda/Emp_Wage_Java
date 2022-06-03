public class classMethod {
    public static final int Wage_per_hr = 20;
    public static final int Full_day_hr = 8;
    public static final int Half_day_hr = 4;
    public static final int Total_Working_Days = 20;
    public static final int Total_Working_Hours = 100;
    public static final int Full_Day_Present = 1;
    public static final int Half_Day_Present = 2;

    public static void myMethod() {

        int total_Emp_hr = 0, total_working_days = 0, daily_wage, monthlyWage;
        while (total_Emp_hr <= Total_Working_Hours && total_working_days <= Total_Working_Days) {
            total_working_days++;
            int random = (int) (Math.random() * 3);

            switch (random) {
                case Full_Day_Present -> {
                    System.out.println("-----------------------------------------");
                    System.out.println("Employee is present in full day");
                    System.out.println("Day#:" + total_working_days + " EmpHr:" + Full_day_hr);

                    daily_wage = Full_day_hr * Wage_per_hr;
                    System.out.println("Employee daily wage is =" + daily_wage);
                    monthlyWage = Total_Working_Days * daily_wage;
                    System.out.println("Employee monthly wage is =" + monthlyWage);
                    total_Emp_hr += Full_day_hr;
//                    System.out.println("Day#:" + total_working_days + " EmpHr:" + Full_day_hr);
                }
                case Half_Day_Present -> {
                    System.out.println("--------------------------------------------");
                    System.out.println("Employee is present in half day");
                    System.out.println("Day#:" + total_working_days + " EmpHr:" + Half_day_hr);

                    daily_wage = Half_day_hr * Wage_per_hr;
                    System.out.println("Employee daily wage is =" + daily_wage);
                    monthlyWage = Total_Working_Days * daily_wage;
                    System.out.println("Employee monthly wage is =" + monthlyWage);
                    total_Emp_hr += Half_day_hr;
//                    System.out.println("Day#:" + total_working_days + " EmpHr:" + Half_day_hr);
                }
                default -> {
                    daily_wage = 0;
                    System.out.println("---------------------------------");
                    System.out.println("Employee is absent");
                    System.out.println("Day#:" + total_working_days + " EmpHr:" + daily_wage);

                    System.out.println("Employee daily wage is =" + daily_wage);
//                    System.out.println("Day#:" + total_working_days + " EmpHr:" + daily_wage);
                }


            }
        }
    }
        public static void main (String[]args){
            myMethod();
        }

    }



