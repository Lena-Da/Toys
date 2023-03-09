public class Toy {
    protected int id;  // идентификатор
    protected String name;  // имя
    protected int count;  // количество
    protected int chance;  // шанс выпадения

    public Toy(int get_id, String get_name, int get_count, int get_chance) {
        id = get_id;
        name = get_name;
        count = get_count;
        chance = get_chance;
    }
}
