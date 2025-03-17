
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;


public class Main{

    public static void main(String[] args) throws IOException {
        //load image and buffer
        File img = new File("YOUR\\PATH\\HERE\\input.jpg");

        BufferedImage image_buffer = ImageIO.read(img);
        System.out.println("BUFFERED");

        //extracting pixels in RGB
        Vector<Pixel> pixels = new Vector<>(image_buffer.getHeight()*image_buffer.getWidth());

        for(int i=0; i<image_buffer.getHeight();i++){
            for(int j=0; j<image_buffer.getWidth();j++){

                int R_G_B = image_buffer.getRGB(j,i);
        
                int Red = (R_G_B>>16) & 0xff;
        
                int Green = (R_G_B>>8) & 0xff;
        
                int Blue = R_G_B & 0xff;
                
                pixels.addElement(new Pixel(Red, Green, Blue));    
                // System.out.print("RED: " + Red + " GREEN: " + Green + " BLUE: " + Blue);

            }
        }
        System.out.println("PIXELS EXTRACTED");

        //String pallete = "  `^,:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
        String pallete = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~i!lI;:,^`  ";
; 
        for(int i=0; i<image_buffer.getHeight()* image_buffer.getWidth();i++){
                int avg = pixels.elementAt(i).Average();

                int index = avg * (pallete.length()-1)/255;
                char letter = pallete.charAt(index);

                pixels.elementAt(i).writeletter(letter);
        }

        //writing in text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            for(int i=0; i<image_buffer.getHeight();i++){
                for(int j=0; j<image_buffer.getWidth();j++){
                    for(int print = 0; print<3; print++) {
                        //in file
                        writer.write(pixels.elementAt(i*image_buffer.getWidth()+j).ascii_pixel);
                        //in console
                        System.out.print(pixels.elementAt(i*image_buffer.getWidth()+j).ascii_pixel);
                    }
                }
                writer.newLine();
                System.out.println();

             }
        }
        System.out.println("FINISHED");
        //for(int i=0; i<image_buffer.getHeight()*image_buffer.getWidth();i++){
        //    System.out.println(pixels.elementAt(i).red + " " + pixels.elementAt(i).green + " " + pixels.elementAt(i).blue);
        //}
       
    }
}