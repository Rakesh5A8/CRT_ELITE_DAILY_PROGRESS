class Result{

    public static int lonelyinteger(List<Integer> a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
            
        }
        for(int j:a){
            if(map.get(j)==1){
                return j;
            }
        }
        return 0;
        

    }

}
