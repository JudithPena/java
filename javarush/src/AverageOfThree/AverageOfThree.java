package AverageOfThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageOfThree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while(true){
            int n = Integer.parseInt(reader.readLine());

            if(n==-1){
                System.out.println(sum / count);
                break;
            } else {
                sum = sum + n;
                count++;
            }
        }
    }
}
