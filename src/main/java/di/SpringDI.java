package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ConsoleInput consoleInput = context.getBean(ConsoleInput.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        consoleInput.print();
    }
}
