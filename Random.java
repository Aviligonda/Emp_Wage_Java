public class Random {
    public static void main(String[] args) {
        int random=(int)(Math.random()*2);
        System.out.println(random);
        if(random==1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
