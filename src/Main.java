public class Main {
    public static void main(String[] args) {
        SlotMachine machine = new SlotMachine();  // создаём объект для розыгрыша игрушек
        machine.add_toy(5, "bear", 3, 56);  // добавляем 3 медведя
        machine.add_toy(149, "fox", 5, 46);  // добавляем 5 лисиц
        machine.try_to_catch(0);
        machine.try_to_catch(1);
        machine.try_to_catch(0);
        machine.try_to_catch(1);
    }
}