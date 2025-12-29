class leetco1351de{
    
    public static int Number(int grid[][]){
        int count = 0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] < 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int grid[][] = {{4,3,2,-1},{3,2,-1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(Number(grid));

    }
}