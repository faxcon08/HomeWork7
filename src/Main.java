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

        System.out.println(ANSI_RED+"Third Task 1.3"+ANSI_RESET);
        int population = 12_000_000;
        int increasePopulation = 17-8; // by 1000;
        for(i=1;i<11;i++){
            population+=(population/1000)*increasePopulation;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }

        System.out.println(ANSI_RED+"Fourth Task 2.1"+ANSI_RESET);
        double deposit = 15_000;
        double percentDeposit = 0.07;
        purpose = 12_000_000;
        month=0;
        while ( deposit<=purpose ){
            System.out.printf("Месяц %2d. Сумма накоплений равна %2$,.2f рублей \n",++month, (deposit+=(deposit*percentDeposit)));
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Потребуется %1$d месяцев для накопления суммы %2$,.2f рублей \n", month, deposit);

        System.out.println(ANSI_RED+"Fifth Task 2.2"+ANSI_RESET);
        month = 0;
        deposit = 15_000;
        while ( deposit<=purpose ){
            month++;
            deposit+=(deposit*percentDeposit);
            if(month%6==0)
                System.out.printf("Месяц %2d. Сумма накоплений равна %2$,.2f рублей \n",month, deposit);
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Потребуется %1$d месяцев для накопления суммы %2$,.2f рублей \n", month, deposit);

        System.out.println(ANSI_RED+"Sixth Task 2.3"+ANSI_RESET);
        deposit = 15_000;
        percentDeposit = 0.07;
        int years = 9 ;
        for(i=1;i<=years*12;i++){
            deposit+=(deposit*percentDeposit);
            if(i%6==0)
                System.out.printf("Месяц %1$3d. Сумма накоплений составляет %2$,.2f рублей \n",i,deposit);
        }

        System.out.println(ANSI_RED+"Seventh Task 2.4"+ANSI_RESET);
        int fridayDate = 3; // 1-7;
        for(i=1;i<=31;i++){
            if(i%7==fridayDate)
                System.out.printf("Сегодня пятница, %d-e число. Необходимо подготовить отчет \n",i);
        }
    } // main
}