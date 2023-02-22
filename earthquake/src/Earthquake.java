import java.util.PriorityQueue;
import java.util.Scanner;


public class Earthquake {
    private static final int MAGIC_NUMBER = -97;

    public static void main(String[] args) {
        //Вы работаете на станции слежения за подземными толчками.
        // Толчки магнитудой до 3 пунктов вас не интересуют.
        // Ваш рабочий день заканчивается, когда со станции управления приходит сигнал - число -97.
        //
        //Вам необходимо понять, было ли за время вашего дежурства что-то странное.
        // Если за время вашего дежурства было зафиксировано не менее 5 толчков сильнее 3 пунктов -
        // их нужно написать в консоль и сообщить о возможном землетрясении.
        // Иначе не писать ничего

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int quake;

        do {
            quake = scanner.nextInt();
            if (quake >= 3 ){
                queue.add(quake);
            }

        } while ( quake != MAGIC_NUMBER);

        if (queue.size() >5){
            System.out.println( "Все очень плохо");
            while (!queue.isEmpty() ){
                System.out.println(queue.poll());
            }
        }


    }
}