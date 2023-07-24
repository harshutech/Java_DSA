import java.util.*;

public class Trapped_rainWater {
    
    public static void trapped_rain_water(int height[],int width){
        int n = height.length;

        //calculate max_left boundary
        int max_left[] = new int[n];
        max_left[0] = height[0];

        for(int i=1; i<n; i++){
            max_left[i] = Math.max(height[i], max_left[i-1]);
        }

        // calculate max_right boundary
        int max_right[] = new int[n];
        max_right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            max_right[i] = Math.max(height[i], max_right[i+1]);
        }

        int trapped_water = 0;
        //loop
        for(int j=0; j<n; j++){

            // water level
            int water_level = Math.min(max_left[j], max_right[j]);

            // trapped rain water
            trapped_water += (water_level - height[j]) * width;
        }

        System.out.print("Trapped water is :- " + trapped_water);
    }







    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;

        trapped_rain_water(height, width);
    }
}
