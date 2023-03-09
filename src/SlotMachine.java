import java.util.Random;
import java.util.Date;

public class SlotMachine {

    protected Toy[] array;  // массив для хранения игрушек
    protected int size;  // кол-во видов игрушек

    Date date = new Date();  // нужно для получения текущего времени
    Random random = new Random(date.getTime());  // рандомное число, где время - его ядро

    public SlotMachine() {  // создаём массив с игрушками
        array = new Toy[100];
        size = 0;
    }

    public void add_toy(int id, String name, int count, int chance) {  // добавляем игрушку в массив
        array[size] = new Toy(id, name, count, chance);
        size += 1;
    }

    public void change_chance(int index, int new_chance) {  // изменяем шанс на выпадение игрушек
        array[index].chance = new_chance;
    }

    public void try_to_catch(int index) {  // пытаемся получить игрушку у автомата
        System.out.print(array[index].name);
        if (random.nextInt(100) < array[index].chance){  // рандомное число меньше чем шанс
            array[index].count -= 1;
            System.out.println(" caught");
        } else {
            System.out.println(" not caught");
        }
    }
}
