import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 10;
    int[] a = {0,0,0,0};
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    public void drawCircle(float x, float y){
        ellipse(x, y * HEIGHT/5,DIAMETER,DIAMETER);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){

    }

    @Override
    public void draw(){
        for(int i = 1; i < 5; i++)
            drawCircle( a[ i - 1 ] += i, i);
    }
}
