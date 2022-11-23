public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"First Task 1.1"+ANSI_RESET);
        int supplement = 15_000;
        int total = 0;
        int purpose = 2_459_000;
        int month = 0;
        while (total<=purpose){
            total+=supplement;
            month++;
            System.out.println("Месяц "+month+", сумма напоплений равна "+total + " рублей");
        }

        System.out.println(ANSI_RED+"Second Task 1.2"+ANSI_RESET);
        int i = 1;
        while (i<=10){
            System.out.print(i++ +" ");
        }
        System.out.println();
        for(i--;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();

    } // main
}