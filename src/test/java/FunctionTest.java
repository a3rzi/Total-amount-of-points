import org.junit.jupiter.api.Test;

public class FunctionTest {

    @Test
    void split() {
        String[] num = {"3:1", "2:2", "0:1", "4:2", "1:0", "0:0", "2:1", "3:3", "1:2", "4:0"};
        for (String separate : num) {
            String[] parts =  separate.split(":",2);
            String part1 = parts[0];
            System.out.println(part1);
        }

    }


}
