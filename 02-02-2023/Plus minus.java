    public static void plusMinus(List<Integer> arr) {
        int l=arr.size();
        int p=0;
        int n=0;
        int z=0;
        for(int i:arr){
            if(i>0){
                p++;
            }
            else if(i==0){
                z++;
            }
            else{
                n++;
            }
        }
        System.out.println(p*1.0/l);
        System.out.println(n*1.0/l);
        System.out.println(z*1.0/l);


    }
