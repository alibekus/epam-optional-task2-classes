package kz.akbar.model;

public class IdGenerator {

    private static int id;

    private IdGenerator() {
    }

    private static class IdGeneratorHolder {
        private static final IdGenerator INSTANCE = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return IdGeneratorHolder.INSTANCE;
    }

    public static int generateId(){
        return ++id;
    }

    public static int getId() {
        return id;
    }
}
