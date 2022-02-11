import java.util.Scanner;

public class task_6 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Выберете величину которую хотите перевести. " +
                "Выберете еденицу измерения: 1 - масса, 2 - расстояние");
        byte x = src.nextByte();
            if (x == 1) {
                System.out.println("Выберете единицу измерения:");
                System.out.println("1-метр, 2-миля, 3-ярд, 4-фут");
                byte y = src.nextByte();
                System.out.println("Введите колличество выбранных единиц");
                int num = src.nextInt();
                double num_int = (int) num;
                    switch (y){
                        case 1:
                            int mil = num * 1609;           //metr
                            double yard = num_int * 1.094;
                            double fut = num_int * 3.281;
                            System.out.println("Результат:");
                            System.out.println("Миля: " + mil);
                            System.out.println("Ярд: " + yard);
                            System.out.println("Фут: " + fut);
                            System.out.println("Хотите выбрать новую величину? Y/N");
                                break;
                        case 2:
                            double metr = num_int / 1609;   //milya
                            double yard_mil = metr * 1.094;
                            double fut_mil = metr * 3.281;
                            System.out.println("Результат:");
                            System.out.println("Метр: " + metr);
                            System.out.println("Ярд: " + yard_mil);
                            System.out.println("Фут: " + fut_mil);
                                break;
                        case 3:
                            double metr_yard = num_int / 1.094;     //yard
                            double mil_yard = metr_yard * 1609;
                            double fut_yard = metr_yard * 3.281;
                            System.out.println("Результат:");
                            System.out.println("Метр: " + metr_yard);
                            System.out.println("Миля: " + mil_yard);
                            System.out.println("Фут: " + fut_yard);
                                break;
                        case 4:
                            double metr_fut = num_int / 3.281;      // fut
                            double mil_fut = metr_fut * 1609;
                            double yard_fut = metr_fut * 1.094;
                            System.out.println("Результат:");
                            System.out.println("Метр: " + metr_fut);
                            System.out.println("Миля: " + mil_fut);
                            System.out.println("Ярд: " + yard_fut);
                                break;
                    default:
                        System.out.println("Извините но заданой вами величины нет");}

            } else if (x == 2){
                System.out.println("Выберете единицу измерения:");
                System.out.println("1-килограмм, 2-грамм, 3-тонна, 4-карат");
                byte y1 = src.nextByte();
                System.out.println("Введите колличество выбранных единиц");
                int num1 = src.nextInt();
                double num_int1 = (int) num1;
                    switch (y1){
                        case 1:
                            int gr = num1 * 1000;        // kg
                            double ton = num_int1 / 1000;
                            int kar = num1 * 5000;
                            System.out.println("Результат:");
                            System.out.println("Граммы: " + gr);
                            System.out.println("Тонны: " + ton);
                            System.out.println("Караты: " + kar);
                                break;
                        case 2:
                            double kg = num_int1 / 1000;     //gramm
                            double ton_gr = kg / 1000;
                            double kar_gr = num_int1 * 5000;
                            System.out.println("Результат:");
                            System.out.println("Килограммы: " + kg);
                            System.out.println("Тонны: " + ton_gr);
                            System.out.println("Караты: " + kar_gr);
                                break;
                        case 3:
                            int kg_ton = num1 * 1000;        //tonna
                            int gr_ton = kg_ton * 1000;
                            int kar_ton = kg_ton * 5000;
                            System.out.println("Результат:");
                            System.out.println("Килограммы: " + kg_ton);
                            System.out.println("Граммы: " + gr_ton);
                            System.out.println("Караты: " + kar_ton);
                                break;
                        case 4:
                            double kg_kar = num_int1 / 5000;     // karat
                            double gr_kar = kg_kar * 1000;
                            double ton_kar = kg_kar / 1000;
                            System.out.println("Результат:");
                            System.out.println("Килограммы: " + kg_kar);
                            System.out.println("Граммы: " + gr_kar);
                            System.out.println("Тонны: " + ton_kar);
                                break;
                    default:
                        System.out.println("Извините но заданой вами величины нет");}
            }else
                System.out.println("Ничего не происходит...");
    }
}