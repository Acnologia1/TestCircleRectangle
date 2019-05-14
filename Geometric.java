package Lession4;

public class Geometric {
    private String color = "white";
    private String filled = null;

    //Các khởi tạo
    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    //Các thuộc tính
    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    //
    public String toString() {
        //return "created with \""+ color + "\" color and"+ (filled == null ?
        // "no fill" : "filled with \"" +filled+ "\" color");
        return " created with  \"" + color + "\" color and " + (filled == null ? " no fill " : " filled with \" " + filled + "\" color ");


    }

}
