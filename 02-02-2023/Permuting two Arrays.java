class Result {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B,Collections.reverseOrder());
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            l.add(A.get(i)+B.get(i));
        }
        for(int j:l){
            if(j<k){
                return "NO";
            }
        }
        
        return "YES";

    }

}
