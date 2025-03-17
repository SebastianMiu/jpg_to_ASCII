public class Pixel {
    int red;
    int green;
    int blue;
    char ascii_pixel;

    Pixel(int red, int green, int blue){
        this.red = 255- red;
        this.green =255- green;
        this.blue = 255- blue;
        //inverted colors: 255 - color

    }

    public void writeletter(char ascii_pixel){
        this.ascii_pixel = ascii_pixel;
    }

    public int Average(){
        int avg = (this.red + this.green + this.blue)/3;
        //int avg = (int) (this.red*0.21 + this.green*0.72 + this.blue*0.07);
        return avg;
    }
}
