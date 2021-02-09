import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTry {
    @Test
    void DragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));

        actions().dragAndDrop($("#column-a"),$("#column-b")).perform();
        $("#column-a").shouldHave(text("B"));
    }
}
