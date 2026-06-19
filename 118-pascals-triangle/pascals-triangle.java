class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main_list=new ArrayList<>();
        for(int row=0;row<numRows;row++){
            List<Integer> cur_list=new ArrayList<>();
            for(int col=0;col<=row;col++){
                if(col==0 || col==row){
                    cur_list.add(1);
                }
                else{
                    List<Integer> prev_list=main_list.get(row-1);
                    cur_list.add(prev_list.get(col-1)+prev_list.get(col));
                }
            }
            main_list.add(cur_list);
        }
        return main_list;
        
    }
}