class star_pattern {
    public static void main(String args[]){
        int n = 4;

        for(int line=1; line<=n; line++){
            for(int j=1; j<=(n-line+1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
