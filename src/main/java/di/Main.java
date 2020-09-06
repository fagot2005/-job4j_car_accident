package di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(UserActions.class);
        context.reg(ConsoleInput.class);

        StartUI ua = context.get(StartUI.class);
        ConsoleInput consoleInput = context.get(ConsoleInput.class);

        ua.add("Petr Arsentev");
        ua.add("Ivan Ivanov");
        ua.print();
        consoleInput.print();
    }
}
