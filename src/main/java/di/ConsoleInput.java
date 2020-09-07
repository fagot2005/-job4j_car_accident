package di;

import org.springframework.stereotype.Component;

@Component
public class ConsoleInput {
    private UserActions userActions;

    public ConsoleInput(UserActions userActions) {
        this.userActions = userActions;
    }

    public void print(){
        for (int i = 0; i < 6; i++) {
            System.out.println(userActions.getId(i));
        }
    }
}
