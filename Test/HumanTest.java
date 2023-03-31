import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    @Test
    public void getNameTest(){
        // Arrange
        Human h = new Human("vardas", "pavarde", 20);
        String expected = "Vaiva";

        // Act
        h.setName("Vaiva");
        String result = h.getName();

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void setNameCamelCaseTest(){
        Human h = new Human("vardas","pavarde",26);
        h.setName("saulius");
        String expected = "Saulius";
        assertEquals(expected,h.getName());
    }
    @Test
    public void setNameCamelCaseOneWordTest(){
        Human h = new Human("vardas", "pavarde",29);
        h.setName("simona vainoraitė");
        String expected = "Simona Vainoraitė";
        assertEquals(expected,h.getName());
    }

    @Test
    public void setNameWithSpaces() {
        Human h = new Human("vardas", "pavarde", 29);
        h.setName("   S o l v e i g      a  ");
        String expected = "Solveiga";
        assertEquals(expected, h.getName());
    }
    @Test
    public void getSurnameTest(){
        Human h = new Human("vardas", "pavarde", 20);
        h.setName("Vainoraitė");
        String expected = "Vainoraitė";
        assertEquals(expected,h.getName());
    }
    @Test
    public void setSurnameCamelCaseTest(){
        Human h = new Human("vardas", "pavarde", 20);
        h.setName("vainoraitė");
        String expected = "Vainoraitė";
        assertEquals(expected,h.getName());
    }
    @Test
    public void setSurnameCamelCaseOneWordTest(){
        Human h = new Human("vardas", "pavarde", 20);
        h.setName("vainoraitė - rukauskienė");
        String expected = "Vainoraitė - Rukauskienė";
        assertEquals(expected,h.getName());
    }

    @Test
    public void getAgeTest(){
        Human h = new Human();
        h.setAge(30);
        int expected = 30;
        assertEquals(expected,h.getAge());
    }
    @Test
    public void setMinusAgeTest(){
        Human h = new Human("vardas","pavarde", 30);
        h.setAge(-30);
        int expected = 0;
        assertEquals(expected,h.getAge());
    }
    @Test
    public void setMinAgeTest(){
        Human h = new Human("vardas","pavarde", 0);
        h.setAge(0);
        int expected = 0;
        assertEquals(expected,h.getAge());
    }
    @Test
    public void setMaxAgeTest(){
        Human h = new Human("vardas","pavarde", 150);
        h.setAge(150);
        int expected = 150;
        assertEquals(expected,h.getAge());
    }
    @Test
    public void setWrongCharTest(){
        Human h = new Human("vardas","pavarde", 60);

    }
}