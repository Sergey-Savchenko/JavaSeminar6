import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String name;
    
    private int RAM;
    private int GB;
    private String operatingSystem;
    private String color;
    
    public Notebook(String name, int RAM, int GB, String operatingSystem, String color) {
        this.name = name;
        this.RAM = RAM;
        this.GB = GB;
        this.operatingSystem = operatingSystem;
        this.color = color;
        }
        
    public boolean validateObject() {
        return true;
    }
        
    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("GB");
        list.add("operatingSystem");
        list.add("color");
    
        return list;
    
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество оперативной памяти:" + RAM +
                ", объём ЖД: " + GB +
                ", операционная система: " + operatingSystem + '\'' +
                ", цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}