import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int[] canvas = {0,0,0,0,0,0,0,0,0};
    static int q = 1;
    public static void main(String[] args){
        while(q==1) {
            drawing();
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            try {
                reader.readLine();
            }
            catch (IOException e){
                System.out.println("error");
            }
            q = 2;
        }
    }
    static void drawing(){
        for (int i=0; i<9;i++) {
            switch (canvas[i]){
                case 0: System.out.print (i); break;
                case 1: System.out.print ("X"); break;
                case 2: System.out.print("O"); break;
            }
            if(i!=2 && i!=5 && i!=8)
                System.out.print(" | ");
            if (i==2 || i==5 )
                System.out.println("\n---------");

        }
        System.out.println();
    }

}

