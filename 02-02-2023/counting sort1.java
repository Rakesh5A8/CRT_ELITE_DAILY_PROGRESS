class Result{

    public static List<Integer> countingSort(List<Integer> arr) {
    List<Integer> l = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            l.add(0);
        }
        for(int value : arr){
            l.set(value, l.get(value)+1);
        }
    
        return l;

    }

}
